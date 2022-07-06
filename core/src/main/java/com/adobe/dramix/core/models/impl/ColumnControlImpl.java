package com.adobe.dramix.core.models.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import com.adobe.dramix.core.models.ColumnControl;

@Model(adaptables = Resource.class, adapters = ColumnControl.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL, resourceType = "dramix/components/columncontrol")
public class ColumnControlImpl implements ColumnControl {
	@Inject
	private int numberOfColumns;

	private List<Integer> list;
	
	private int countClass;

	@PostConstruct
	private void init() {
		list = new ArrayList<>();
		if (numberOfColumns > 0) {
			countClass = 12 / numberOfColumns;
			for (int i = 0; i < numberOfColumns; i++) {
				list.add(i);
			}
		}
	}

	@Override
	public List<Integer> getList() {
		return list;
	}

	@Override
	public int getColumnCount() {
		return countClass;
	}

}
