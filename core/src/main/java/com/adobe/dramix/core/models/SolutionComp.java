package com.adobe.dramix.core.models;

import java.util.List;

import com.adobe.dramix.core.helper.SolutionCompPojo;

public interface SolutionComp {

	List<SolutionCompPojo> getChallengeDetails();
	List<SolutionCompPojo> getSoftwareDetails();

}
