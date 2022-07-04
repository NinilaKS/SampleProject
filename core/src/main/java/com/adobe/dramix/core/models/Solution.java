package com.adobe.dramix.core.models;

import java.util.List;
import java.util.Map;

public interface Solution {
	
	List<Map<String, String>> getChallengeDetailsWithMap();
    List<Map<String, String>> getSoftwareDetailsWithMap();

}
