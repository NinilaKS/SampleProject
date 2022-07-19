package com.adobe.dramix.core.models.impl;

import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import com.adobe.dramix.core.models.Banner;
import com.adobe.dramix.core.models.BannerDetail;

@Model(adaptables = Resource.class, adapters = Banner.class, 
       resourceType = ListingImpl.RESOURCE_TYPE, 
       defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ListingImpl implements Banner {

	protected static final String RESOURCE_TYPE = "dramix/components/banner-home";

	@ChildResource
	private List<BannerDetail> listing;

	@Override
	public List<BannerDetail> getBannerDetails() {
		return listing;
	}
}
