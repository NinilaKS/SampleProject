package com.adobe.dramix.core.models;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BannerDetail {

	private static final Logger LOG = LoggerFactory.getLogger(BannerDetail.class);

	String subHeading;
	String heading;
	String buttonText;
	String buttonLink;

	/**
	 * @param resource
	 */
	public BannerDetail(Resource resource){
		try {
			if(StringUtils.isNotBlank(resource.getValueMap().get("subHeading", String.class))) {
				this.subHeading = resource.getValueMap().get("subHeading", String.class);
			}
			if(StringUtils.isNotBlank(resource.getValueMap().get("heading", String.class))) {
				this.heading=resource.getValueMap().get("heading",String.class);
			}
			if(resource.getValueMap().get("buttonText",String.class)!=null) {
				this.buttonText=resource.getValueMap().get("buttonText",String.class);
			}
			if(resource.getValueMap().get("buttonLink",String.class)!=null) {
				this.buttonLink=resource.getValueMap().get("buttonLink",String.class);
			}

		}catch (Exception e){
			LOG.info("\n BEAN ERROR : {}",e.getMessage());
		}

	}

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
