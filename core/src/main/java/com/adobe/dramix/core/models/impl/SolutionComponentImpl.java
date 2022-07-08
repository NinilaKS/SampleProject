package com.adobe.dramix.core.models.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.dramix.core.helper.SolutionPojo;
import com.adobe.dramix.core.models.SolutionComponent;




/**
 * @author rdomala001
 * The Class SolutionComponentImpl.
 */
@Model(
		adaptables = SlingHttpServletRequest.class,
		adapters = SolutionComponent.class,
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
		)
public class SolutionComponentImpl implements SolutionComponent{
	private static final Logger LOG = LoggerFactory.getLogger(SolutionComponentImpl.class);

	@Inject
	Resource componentResource;
	/**
	 * Gets the challengeMultifield fields.
	 *
	 * @return the challengeDetailsBean
	 */
	@Override
	public List<SolutionPojo> getChallengeDetailsWithMap(){
		List<SolutionPojo> challengeDetailsBean=new ArrayList<>();
		try {
			Resource challengeDetailBean=componentResource.getChild("challengedetailswithmap");
			if(challengeDetailBean!=null){
				for (Resource challengeBean : challengeDetailBean.getChildren()) {


					challengeDetailsBean.add(new SolutionPojo(challengeBean));
				}
			}
		}catch (Exception e){
			LOG.info("\n ERROR while getting Book Details With Bean {} ",e.getMessage());
		}
		return challengeDetailsBean;
	}
	/**
	 * Gets the softwareMultifield fields.
	 *
	 * @return the softwareDetailsBean
	 */
	@Override
	public List<SolutionPojo> getSoftwareDetailsWithMap(){
		List<SolutionPojo> softwareDetailsBean=new ArrayList<>();
		try {
			Resource softwareDetailBean=componentResource.getChild("softwaremultifield");
			if(softwareDetailBean!=null){
				for (Resource softwareBean : softwareDetailBean.getChildren()) {


					softwareDetailsBean.add(new SolutionPojo(softwareBean));
				}
			}
		}catch (Exception e){
			LOG.info("\n ERROR while getting Book Details With Bean {} ",e.getMessage());
		}
		return softwareDetailsBean;
	}



}
