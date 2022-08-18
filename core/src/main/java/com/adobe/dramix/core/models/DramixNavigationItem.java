package com.adobe.dramix.core.models;

import java.util.ArrayList;
import java.util.List;

public class DramixNavigationItem{
	
	private String title;
	
	private String URL;
	
	private String navDescription;
	
	private String subSectionImage;
	
	private boolean isAddLink;
	
	private boolean isCurrent;
	
	private List<DramixNavigationItem> children = new ArrayList<>();

	public List<DramixNavigationItem> getChildren() {
		return children;
	}
	
	public void setChildren(List<DramixNavigationItem> children) {
		this.children = children;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public String getNavDescription() {
		return navDescription;
	}

	public void setNavDescription(String navDescription) {
		this.navDescription = navDescription;
	}
	
	public String getSubSectionImage() {
		return subSectionImage;
	}

	public void setSubSectionImage(String subSectionImage) {
		this.subSectionImage = subSectionImage;
	}

	public boolean isAddLink() {
		return isAddLink;
	}

	public void setAddLink(boolean isAddLink) {
		this.isAddLink = isAddLink;
	}

	public boolean isCurrent() {
		return isCurrent;
	}

	public void setCurrent(boolean isCurrent) {
		this.isCurrent = isCurrent;
	}

}
