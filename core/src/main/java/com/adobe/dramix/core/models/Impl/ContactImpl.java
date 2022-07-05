package com.adobe.dramix.core.models.Impl;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import com.adobe.dramix.core.helper.ContactHelper;
import com.adobe.dramix.core.models.Contact;

/**
 * @author vmaindala001
 *
 */
@Model(adaptables = SlingHttpServletRequest.class,adapters = Contact .class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ContactImpl implements Contact {
	@Inject
	Resource resource;
	@Override
	public List<ContactHelper> getContactAreaDetails() {
		ArrayList<ContactHelper> object=new ArrayList<>();
		Resource resource2 = resource.getChild("expertlist");
		if (resource2!=null) {
			for(Resource adaptresource:resource2.getChildren()) {
				ContactHelper contacthelper = new ContactHelper();
				String imagePathValue = adaptresource.getValueMap().get("imagepath").toString();
				String imageTitleValue = adaptresource.getValueMap().get("imagetitle").toString();
				String imageDescriptionValue= adaptresource.getValueMap().get("imagedescription").toString();
				contacthelper.setImagedescription(imageDescriptionValue);
				contacthelper.setImagepath(imagePathValue);
				contacthelper.setImagetitle(imageTitleValue);
			
				object.add(contacthelper);
			}
			
		}
		return object;
	}

}

