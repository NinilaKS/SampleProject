package com.adobe.dramix.core.models.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.via.ResourceSuperType;

import com.adobe.cq.wcm.core.components.models.Navigation;
import com.adobe.cq.wcm.core.components.models.NavigationItem;
import com.adobe.dramix.core.models.DramixNavigation;
import com.adobe.dramix.core.models.DramixNavigationItem;

@Model(adaptables = SlingHttpServletRequest.class, adapters = DramixNavigation.class, resourceType = DramixNavigationImpl.RESOURCE_TYPE, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class DramixNavigationImpl implements DramixNavigation {

	// points to the the component resource path in ui.apps
	static final String RESOURCE_TYPE = "dramix/components/navigation";

	@Self
	@Via(type = ResourceSuperType.class)
	private Navigation coreNavigation;

	private List<DramixNavigationItem> items;

	@SlingObject
	private ResourceResolver resourceResolver;

	@Override
	public List<DramixNavigationItem> getNavItems() {
		items = new ArrayList<>();
		if (null != coreNavigation) {
			for (NavigationItem coreNavItem : coreNavigation.getItems()) {
				DramixNavigationItem navItem = new DramixNavigationItem();
				navItem.setTitle(coreNavItem.getTitle());
				navItem.setURL(coreNavItem.getLink().getURL());
				navItem.setCurrent(coreNavItem.isCurrent());

				setCustomProperties(coreNavItem, navItem);

				if (!coreNavItem.getChildren().isEmpty()) {
					for (NavigationItem coreNavChildren : coreNavItem.getChildren()) {
						DramixNavigationItem childNavItem = new DramixNavigationItem();
						childNavItem.setTitle(coreNavChildren.getTitle());
						childNavItem.setURL(coreNavChildren.getLink().getURL());
						navItem.getChildren().add(childNavItem);

					}
				}
				items.add(navItem);
			}
		}
		return items;
	}

	private void setCustomProperties(NavigationItem coreNavItem, DramixNavigationItem navItem) {
		if (null != coreNavItem.getPath()) {
			Resource resource = resourceResolver.getResource(coreNavItem.getPath());
			if (null != resource) {
				Resource jcrContentResource = resource.getChild("jcr:content");
				if (null != jcrContentResource) {
					ValueMap valueMap = jcrContentResource.getValueMap();
					String addLink = valueMap.get("addLink", String.class);
					if (null != addLink) {
						navItem.setAddLink(Boolean.valueOf(addLink));
					}
					navItem.setNavDescription(valueMap.get("navigationDescription", String.class));
				}
			}
		}
	}

}