package com.adobe.dramix.core.models;

import java.util.List;

import com.adobe.cq.wcm.core.components.models.Navigation;

public interface DramixNavigation extends Navigation{
	
	List<DramixNavigationItem> getNavItems();
}
