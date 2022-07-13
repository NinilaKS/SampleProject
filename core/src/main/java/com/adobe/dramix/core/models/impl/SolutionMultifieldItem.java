package com.adobe.dramix.core.models.impl;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, 
       defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class SolutionMultifieldItem {

	@ValueMapValue
	private String heading;
	@ValueMapValue
	private String title;
	@ValueMapValue
	private String subHeading;
	@ValueMapValue
	private String description;
	@ValueMapValue
	private String buttonLabel;
	@ValueMapValue
	private String buttonUrl;
	@ValueMapValue
	private String link;

	public String getHeading() {
		return heading;
	}

	public String getTitle() {
		return title;
	}

	public String getSubHeading() {
		return subHeading;
	}

	public String getDescription() {
		return description;
	}

	public String getButtonLabel() {
		return buttonLabel;
	}

	public String getButtonUrl() {
		return buttonUrl;
	}

	public String getLink() {
		return link;
	}
}
