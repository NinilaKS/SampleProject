package com.adobe.dramix.core.models.impl;

import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.dramix.core.models.BannerDetail;
import com.adobe.dramix.core.models.Listing;


@Model(
		adaptables = Resource.class,
		adapters = Listing.class,
		resourceType = ListingImpl.RESOURCE_TYPE,
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
		)
public class ListingImpl implements Listing {

    protected static final String RESOURCE_TYPE = "dramix/components/banner-home";

	@ChildResource
	private List<BannerDetail> listing;
	
	/**
	 * @author karora044
     * Impl that list all the values of product item details
	 * @return list
	 */
	
	@Override
	public List<BannerDetail> getBannerDetails(){
		return listing;
	}    	
}

