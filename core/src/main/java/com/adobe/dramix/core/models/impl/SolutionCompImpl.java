package com.adobe.dramix.core.models.impl;


import java.util.List;

import javax.inject.Named;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import com.adobe.dramix.core.helper.SolutionCompPojo;
import com.adobe.dramix.core.models.SolutionComp;

@Model(adaptables = Resource.class, adapters = SolutionComp.class, 
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL, 
resourceType = SolutionCompImpl.RESOURCE_TYPE)
public class SolutionCompImpl implements SolutionComp{
	
	protected final static String RESOURCE_TYPE = "dramix/components/solutioncomponent";
	
	@ChildResource
	@Named("challengedetails")
	private List<SolutionCompPojo> challengeDetails;
	
	@ChildResource
	@Named("softwaredetails")
	private List<SolutionCompPojo> softwareDetails;
	
	
	@Override
	public List<SolutionCompPojo> getChallengeDetails() {
		return challengeDetails;
	}


	@Override
	public List<SolutionCompPojo> getSoftwareDetails() {
		return softwareDetails;
	}

}
