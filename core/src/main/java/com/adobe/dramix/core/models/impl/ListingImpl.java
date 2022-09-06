package com.adobe.dramix.core.models.impl;


import java.util.ArrayList;
import java.util.List;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import com.adobe.dramix.core.bean.ListingResults;
import com.adobe.dramix.core.models.Listing;

@Model(adaptables = SlingHttpServletRequest.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ListingImpl implements Listing {
	private String[] cssClass={"col-12 listing-top-div d-flex mb-3","col-6 col-sm-6 col-md-6 col-lg-3 col-xl-3 listing-small-div mb-3",
	"col-6 col-sm-6 col-md-6 col-lg-3 col-xl-3 listing-small-div mb-3","col-6 col-sm-6 col-md-6 col-lg-3 col-xl-3 listing-small-div mb-3",
	"col-6 col-sm-6 col-md-6 col-lg-3 col-xl-3 listing-small-div mb-3","col-12 col-sm-12 col-md-12 col-lg-3 col-xl-3 listing-small-div mb-3",
	"col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6 listing-small-div mb-3 listing-medium-div","col-6 col-sm-6 col-md-6 col-lg-3 col-xl-3 listing-small-div mb-3",
	"col-6 col-sm-6 col-md-6 col-lg-3 col-xl-3 listing-small-div mb-3","col-6 col-sm-6 col-md-6 col-lg-3 col-xl-3 listing-small-div mb-3",
	"col-12 col-sm-12 col-md-12 col-lg-3 col-xl-3 listing-small-div mb-3","col-6 col-sm-6 col-md-6 col-lg-3 col-xl-3 listing-small-div mb-3",
	"col-6 col-sm-6 col-md-6 col-lg-6 col-xl-6 listing-small-div listing-medium-div mb-3","col-6 col-sm-6 col-md-6 col-lg-3 col-xl-3 listing-small-div mb-3",
	"col-6 col-sm-6 col-md-6 col-lg-3 col-xl-3 listing-small-div mb-3"};

	@Override

	public List<ListingResults> fetchResults() {
		List<ListingResults> resultList = new ArrayList<>();
		for(int i=0;i<15;i++){
        ListingResults obj = new ListingResults();
		obj.setCssClass(cssClass[i]);
		obj.setDesc("ImageDesc");
		obj.setDestUrl("http://www.google.com");
		obj.setImageUrl("https://s7ips3.scene7.com/is/image/bekaertstage/enduro-trail-jump");
		obj.setTitle("Image"+i);
		resultList.add(obj);
		}
		return resultList;
	}

	
	
}
