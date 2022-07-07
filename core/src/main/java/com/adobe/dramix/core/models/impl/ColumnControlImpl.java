package com.adobe.dramix.core.models.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.dramix.core.models.ColumnControl;

@Model(adaptables = Resource.class, adapters = ColumnControl.class, 
       defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL, 
       resourceType = ColumnControlImpl.RESOURCE_TYPE)
public class ColumnControlImpl implements ColumnControl {

	protected final static String RESOURCE_TYPE = "dramix/components/columncontrol";

	private final static int GRID_SIZE = 12;

	@ValueMapValue
	private int numberOfColumns;

	private List<Integer> list;

	private int countClass;

	@PostConstruct
	private void init() {
		list = new ArrayList<>();
		if (numberOfColumns > 0) {
			countClass = GRID_SIZE / numberOfColumns;
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
