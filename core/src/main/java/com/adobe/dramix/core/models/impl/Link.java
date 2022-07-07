package com.adobe.dramix.core.models.impl;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Link {

	@ValueMapValue
	private String linkTitle;

	@ValueMapValue
	private String linkUrl;

	public String getLinkTitle() {
		return linkTitle;
	}

	public String getLinkUrl() {
		return linkUrl;
	}
}
