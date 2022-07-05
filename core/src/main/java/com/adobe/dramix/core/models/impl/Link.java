package com.adobe.dramix.core.models.impl;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Link {
	@Inject
	private String linkTitle;
	@Inject
	private String linkUrl;

	public String getLinkTitle() {
		return linkTitle;
	}

	public String getLinkUrl() {
		return linkUrl;
	}

}
