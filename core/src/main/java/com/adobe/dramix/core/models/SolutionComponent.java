package com.adobe.dramix.core.models;

import java.util.List;

import com.adobe.dramix.core.helper.SolutionPojo;

/**
 * The Interface SolutionComponent.
 */
public interface SolutionComponent{

	List<SolutionPojo> getChallengeDetailsWithMap();
	List<SolutionPojo> getSoftwareDetailsWithMap();

}
