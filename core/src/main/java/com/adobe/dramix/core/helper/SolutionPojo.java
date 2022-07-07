package com.adobe.dramix.core.helper;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SolutionPojo {
	private static final Logger LOG = LoggerFactory.getLogger(SolutionPojo.class);
	private String challengeHeading;
	private String challengeDesc;
	private String softwares;
	private String desc;

	public SolutionPojo(Resource resource){
		try {
			if(StringUtils.isNotBlank(resource.getValueMap().get("challengeheading", String.class))) {
				this.challengeHeading = resource.getValueMap().get("challengeheading", String.class);
			}
			if(StringUtils.isNotBlank(resource.getValueMap().get("challengedesc", String.class))) {
				this.challengeDesc=resource.getValueMap().get("challengedesc",String.class);
			}
			if(StringUtils.isNotBlank(resource.getValueMap().get("softwares", String.class))) {
				this.softwares=resource.getValueMap().get("softwares",String.class);
			}
			if(StringUtils.isNotBlank(resource.getValueMap().get("desc", String.class))) {
				this.desc=resource.getValueMap().get("desc",String.class);
			}

		}
		catch (Exception e){
			LOG.info("\n BEAN ERROR : {}",e.getMessage());
		}
	}
	public String getChallengeHeading() {
		return challengeHeading;
	}

	public String getChallengeDesc() {
		return challengeDesc;
	}
	public String getSoftwares() {
		return softwares;
	}
	public String getDesc() {
		return desc;
	}

}
