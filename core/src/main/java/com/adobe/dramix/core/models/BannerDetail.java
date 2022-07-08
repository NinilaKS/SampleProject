package com.adobe.dramix.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BannerDetail {

	/**
	 * @author karora044
	 *  Bannner item fields
	 */
	@ValueMapValue
	private String subHeading;
	
	@ValueMapValue
	private String heading;
	
	@ValueMapValue
	private String buttonText;
	
	@ValueMapValue
	private String buttonLink;


	public String getSubHeading() {
		return subHeading;
	}
	public String getHeading() {
		return heading;
	}
	public String getButtonText() {
		return buttonText;
	}
	public String getButtonLink() {
		return buttonLink;
	}

}
