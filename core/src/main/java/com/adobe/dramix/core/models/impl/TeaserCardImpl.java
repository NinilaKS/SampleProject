package com.adobe.dramix.core.models.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.dramix.core.models.TeaserCard;

@Model(adaptables = Resource.class, adapters = TeaserCard.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL, resourceType = TeaserCardImpl.RESOURCE_TYPE)
public class TeaserCardImpl implements TeaserCard {

	protected static final String RESOURCE_TYPE = "dramix/components/teasercards";
	private List<Integer> list = new ArrayList<>();

	@ValueMapValue
	private int numberOfTeasers;

	@PostConstruct
	private void addList() {
		for (int i = 0; i < numberOfTeasers; i++) {
			list.add(i);
		}
	}

	@Override
	public List<Integer> getList() {
		return list;
	}

}
