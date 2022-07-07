package com.adobe.dramix.core.models.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.dramix.core.models.BannerDetail;
import com.adobe.dramix.core.models.Listing;


@Model(
		adaptables = Resource.class,
		adapters = Listing.class,
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
		resourceType = "dramix/components/banner-home"
		)
public class ListingImpl implements Listing {

	private static final Logger LOG = LoggerFactory.getLogger(ListingImpl.class);

	@Self
	Resource componentResource;

	/**
	 * @author karora044
	 * Lists all the Banner Items 
	 * @return List
	 */
	@Override
	public List<BannerDetail> getBannerDetails(){
		List<BannerDetail> bannerDetailBean=new ArrayList<>();
		try {
			Resource resource=componentResource.getChild("listing");
			if(resource!=null){
				for (Resource reponse : resource.getChildren()) {
					LOG.info("\n SubHeading {} ",reponse.getValueMap().get("subHeading",String.class));

					bannerDetailBean.add(new BannerDetail(reponse));
				}
			}
		}catch (Exception e){
			LOG.info("\n ERROR while getting Banner Details {} ",e.getMessage());
		}
		return bannerDetailBean;
	}    
}
