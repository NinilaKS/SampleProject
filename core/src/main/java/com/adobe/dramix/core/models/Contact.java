package com.adobe.dramix.core.models;

import java.util.List;

import com.adobe.dramix.core.models.impl.ContactHelper;

public interface Contact {
    /**
     * Method to get the contact details
     */
	List<ContactHelper> getContactDetails();
}
