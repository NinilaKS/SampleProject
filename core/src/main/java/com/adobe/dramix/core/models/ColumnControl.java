package com.adobe.dramix.core.models;

import java.util.List;

public interface ColumnControl {
	/**
	 * Method to get list for iterating in HTML.
	 */
	List<Integer> getList();

	/**
	 * Method to get column count to use for setting css class name.
	 */
	int getColumnCount();

}
