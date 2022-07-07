package com.adobe.dramix.core.models.impl;


import java.util.List;

import javax.inject.Named;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.dramix.core.helper.SolutionPojo;
import com.adobe.dramix.core.models.SolutionComp;

@Model(adaptables = Resource.class, adapters = SolutionComp.class, 
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL, 
resourceType = SolutionCompImpl.RESOURCE_TYPE)
public class SolutionCompImpl implements SolutionComp{
	
	protected final static String RESOURCE_TYPE = "dramix/components/solutioncomponent";
	
	@ChildResource
	@Named("challengedetailswithmap")
	private List<SolutionPojo> challengeDetails;
	
	@ChildResource
	@Named("softwaremultifield")
	private List<SolutionPojo> softwareDetails;
	
	
	@Override
	public List<SolutionPojo> getChallengeDetailsWithMap() {
		return challengeDetails;
	}


	@Override
	public List<SolutionPojo> getSoftwareDetailsWithMap() {
		return softwareDetails;
	}

}
