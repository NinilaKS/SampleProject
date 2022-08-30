
package com.adobe.dramix.core.servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.jcr.Session;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.day.cq.commons.jcr.JcrConstants;
import com.day.cq.dam.api.DamConstants;
import com.day.cq.search.PredicateGroup;
import com.day.cq.search.Query;
import com.day.cq.search.QueryBuilder;
import com.day.cq.search.result.Hit;
import com.day.cq.search.result.SearchResult;
import com.day.cq.tagging.Tag;
import com.day.cq.tagging.TagConstants;
import com.day.cq.tagging.TagManager;
import com.google.gson.JsonObject;

@Component(immediate = true, service = Servlet.class, property = {
	Constants.SERVICE_DESCRIPTION + "= Dramix filter Servlet", "sling.servlet.methods=" + HttpConstants.METHOD_GET,
	"sling.servlet.resourceTypes=" + "sling/servlet/default", "sling.servlet.selectors=" + "upcomingevents",
	"sling.servlet.selectors=" + "upcomingevents","sling.servlet.selectors=" + "projects","sling.servlet.selectors=" + "certificates",
	"sling.servlet.selectors=" + "experttalks","sling.servlet.selectors=" + "products","sling.servlet.selectors=" + "whitepapers",
	"sling.servlet.extensions=" + "json" })

public class FetchListingPageData extends SlingSafeMethodsServlet {

	private static final long serialVersionUID = 1L;
	private static final Logger log = LoggerFactory.getLogger(FetchListingPageData.class);

	private Session session;
	String assetSelector = null;

	@Reference
	private QueryBuilder builder;

	/// content/dam/dramix/upcomingevents;
	/**
	 * This method will query the asset based on tags like 3d,4d,5d and send the
	 * results in response.
	 */

	@Override
	protected void doGet(final SlingHttpServletRequest request, final SlingHttpServletResponse response)
			throws ServletException, IOException {

		try {

			ResourceResolver resourceResolver = request.getResourceResolver();

			session = resourceResolver.adaptTo(Session.class);
			Query query = null;
			Map<String, String> predicate = new HashMap<>();

			predicate.put("path", "/content/dam/dramix");
			predicate.put("type", DamConstants.NT_DAM_ASSET);
			predicate.put("p.limit", "-1");
			query = builder.createQuery(PredicateGroup.create(predicate), session);
			SearchResult searchResult = query.getResult();

			String selector = request.getRequestPathInfo().getSelectors()[0];
			JsonObject filterJson = new JsonObject();
			TagManager tagManager = resourceResolver.adaptTo(TagManager.class);
			String tagToBeSearched = TagConstants.TAG_ROOT_PATH+"/bpr" + "/" + selector;
			Tag tag = tagManager.resolve(tagToBeSearched);
			JsonObject filterListObj = new JsonObject();
			JsonObject pageResponse = new JsonObject();
            int i=0;
			for (Hit hit : searchResult.getHits()) {
				JsonObject resultRes = new JsonObject();
				String resultPath = hit.getPath();
				final Resource payloadResource = resourceResolver.getResource(resultPath);
				final Resource metadataResource = payloadResource.getChild(JcrConstants.JCR_CONTENT+"/"+DamConstants.METADATA_FOLDER);
				resultRes.addProperty("assetPath", resultPath);
				for (Tag tagVal : tagManager.getTags(metadataResource)) {
					resultRes.addProperty(tagVal.getName(), tagVal.getPath());
				  }
				  pageResponse.add("results"+i,resultRes);
				 
				  i++;
				}
				filterJson.add("pageResponse",pageResponse);
			Iterator<Tag> tags = tag.listChildren();
			while (tags.hasNext()) {
				Tag tagIterated = tags.next();	
				JsonObject filterObj = new JsonObject();
				filterObj.addProperty("path",tagIterated.getPath());
				JsonObject childListObj = new JsonObject();
				Iterator<Tag> grandChildTags = tagIterated.listChildren();
				 while(grandChildTags.hasNext()){
					JsonObject childfilterObj = new JsonObject();
					Tag tagChildIterated = grandChildTags.next();
					childfilterObj.addProperty("path",tagChildIterated.getPath());
					childListObj.add(tagChildIterated.getTitle(),childfilterObj);
				 }
				 filterObj.add("child", childListObj);
				 filterListObj.add(tagIterated.getTitle(),filterObj);
	
			}
			filterJson.add("filter", filterListObj);
			response.getWriter().print(filterJson);
		} catch (Exception e) {

		}

	}

}