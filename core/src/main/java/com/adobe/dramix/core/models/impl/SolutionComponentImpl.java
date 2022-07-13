package com.adobe.dramix.core.models.impl;

import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import com.adobe.dramix.core.models.SolutionComponent;

@Model(adaptables = Resource.class, adapters = SolutionComponent.class, 
       defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL, 
       resourceType = SolutionComponentImpl.RESOURCE_TYPE)
public class SolutionComponentImpl implements SolutionComponent {

	protected final static String RESOURCE_TYPE = "dramix/components/solutioncomponent";

	@ChildResource
	private List<SolutionMultifieldItem> challengeDetails;

	@ChildResource
	private List<SolutionMultifieldItem> solutions;

	@Override
	public List<SolutionMultifieldItem> getChallengeList() {
		return challengeDetails;
	}

	@Override
	public List<SolutionMultifieldItem> getSolutionList() {
		return solutions;
	}

}
