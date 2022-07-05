package com.adobe.dramix.core.models.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.dramix.core.models.Product;
import com.adobe.dramix.core.models.ProductDetail;

@Model(
		adaptables = SlingHttpServletRequest.class,
		adapters = Product.class,
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
		)
public class ProductImpl implements Product {

	private static final Logger LOG = LoggerFactory.getLogger(ProductImpl.class);

	@Inject
	Resource componentResource;

	/**
	 * @author karora044
	 * List all the values of product items details
	 * @return list
	 */
	@Override
	public List<ProductDetail> getProductDetails(){

		List<ProductDetail> productDetailBean=new ArrayList<>();
		try {
			Resource resource=componentResource.getChild("listing");
			if(resource!=null){
				for (Resource reponse : resource.getChildren()) {
					LOG.info("\n SubHeading {} ",reponse.getValueMap().get("subHeading",String.class));

					productDetailBean.add(new ProductDetail(reponse));
				}
			}
		}catch (Exception e){
			LOG.info("\n ERROR while getting Banner Details {} ",e.getMessage());
		}
		return productDetailBean;
	}   
}
