package com.adobe.dramix.core.helper;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class SolutionCompPojo {
	
	
	@ValueMapValue
	private String challengeHeading;
	@ValueMapValue
	private String challengeDesc;
	@ValueMapValue
	private String softwares;
	@ValueMapValue
	private String desc;
	@ValueMapValue
	private String challengeLink;
	@ValueMapValue
	private String softwareLink;

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
	public String getChallengeLink() {
		return challengeLink;
	}
	public String getSoftwareLink() {
		return softwareLink;
	}

}
