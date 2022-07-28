package com.adobe.dramix.core.models.impl;

import java.util.List;

import javax.inject.Named;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import com.adobe.dramix.core.models.Contact;

@Model(adaptables = Resource.class, 
       adapters = Contact.class, 
       defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL, 
       resourceType = ContactImpl.RESOURCE_TYPE)
public class ContactImpl implements Contact {

	protected final static String RESOURCE_TYPE = "dramix/components/contact";

	@ChildResource
	@Named("contactList")
	private List<ContactHelper> contactList;

	@Override
	public List<ContactHelper> getContactDetails() {
		return contactList;
	}

}
