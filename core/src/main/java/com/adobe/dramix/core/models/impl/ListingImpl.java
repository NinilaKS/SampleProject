package com.adobe.dramix.core.models.impl;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.dramix.core.models.BannerDetail;
import com.adobe.dramix.core.models.Listing;

import javax.inject.Inject;
import java.util.*;


@Model(
		adaptables = SlingHttpServletRequest.class,
		adapters = Listing.class,
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
		)
public class ListingImpl implements Listing {

	private static final Logger LOG = LoggerFactory.getLogger(ListingImpl.class);

	@Inject
	Resource componentResource;

	/**
	 * @author karora044
	 * Lists all the Banner Items 
	 * @return List
	 */
	@Override
	public List<BannerDetail> getBannerDetails(){
		List<BannerDetail> bannerDetailBean=new ArrayList<>();
		try {
			Resource resource=componentResource.getChild("listing");
			if(resource!=null){
				for (Resource reponse : resource.getChildren()) {
					LOG.info("\n SubHeading {} ",reponse.getValueMap().get("subHeading",String.class));

					bannerDetailBean.add(new BannerDetail(reponse));
				}
			}
		}catch (Exception e){
			LOG.info("\n ERROR while getting Banner Details {} ",e.getMessage());
		}
		return bannerDetailBean;
	}    
}
