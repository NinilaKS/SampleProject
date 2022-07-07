package com.adobe.dramix.core.models;

import java.util.List;

import com.adobe.dramix.core.helper.SolutionPojo;

public interface SolutionComp {

	List<SolutionPojo> getChallengeDetailsWithMap();
	List<SolutionPojo> getSoftwareDetailsWithMap();

}
