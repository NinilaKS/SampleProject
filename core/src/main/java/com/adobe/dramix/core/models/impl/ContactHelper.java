package com.adobe.dramix.core.models.impl;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ContactHelper {

	@ValueMapValue
	private String name;
	
	@ValueMapValue
	private String details;
	
	@ValueMapValue
	private String imagePath;

	public String getImagePath() {
		return imagePath;
	}

	public String getName() {
		return name;
	}

	public String getDetails() {
		return details;
	}

}
