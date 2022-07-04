package com.adobe.dramix.core.models.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.dramix.core.models.Solution;



@Model(adaptables = SlingHttpServletRequest.class,
adapters = Solution.class,

defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)

public class SolutionImpl implements Solution {
	
private static final Logger LOG = LoggerFactory.getLogger(SolutionImpl.class);
    

    @Inject
    Resource resource;

    @SlingObject
    ResourceResolver resourceResolver;

    @Self
    SlingHttpServletRequest slingHttpServletRequest;

   
    @Override
    public List<Map<String, String>> getChallengeDetailsWithMap() {
        List<Map<String, String>> bookDetailsMap=new ArrayList<>();
        try {
            Resource bookDetail=resource.getChild("challengedetailswithmap");
            if(bookDetail!=null){
                for (Resource book : bookDetail.getChildren()) {
                    Map<String,String> bookMap=new HashMap<>();
                    bookMap.put("challengeheading",book.getValueMap().get("challengeheading",String.class));
                    bookMap.put("challengedesc",book.getValueMap().get("challengedesc",String.class));
                    bookDetailsMap.add(bookMap);
                }
            }
        }catch (Exception e){
            LOG.info("\n ERROR while getting Book Details {} ",e.getMessage());
        }
        return bookDetailsMap;
    }
    
    
    @Override
    public List<Map<String, String>> getSoftwareDetailsWithMap() {
        List<Map<String, String>> challengeDetailsMap=new ArrayList<>();
        try {
            Resource challengeDetail=resource.getChild("softwaremultifield");
            if(challengeDetail!=null){
                for (Resource book : challengeDetail.getChildren()) {
                    Map<String,String> challengeMap=new HashMap<>();
                    challengeMap.put("softwares",book.getValueMap().get("softwares",String.class));
                    challengeMap.put("desc",book.getValueMap().get("desc",String.class));
                    challengeDetailsMap.add(challengeMap);
                }
            }
        }catch (Exception e){
            LOG.info("\n ERROR while getting Book Details {} ",e.getMessage());
        }
        return challengeDetailsMap;
    }

}
