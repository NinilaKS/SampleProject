package com.adobe.dramix.core.models;

import java.util.List;

import com.adobe.dramix.core.models.impl.SolutionMultifieldItem;

public interface SolutionComponent {
	/**
	 * Method to return Challenge List
	 * 
	 * @return List of Challenge multifield items
	 */
	List<SolutionMultifieldItem> getChallengeList();

	/**
	 * Method to return Solution List
	 * 
	 * @return List of Solution multifield items
	 */
	List<SolutionMultifieldItem> getSolutionList();

}
