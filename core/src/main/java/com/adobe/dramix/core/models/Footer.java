package com.adobe.dramix.core.models;

import java.util.List;

import com.adobe.dramix.core.models.impl.Link;

/**
 * Interface for Footer Component
 */
public interface Footer {
	/**
	 * Method to return Logopath
	 * 
	 * @return String
	 */
	String getLogoPath();

	/**
	 * Method to return FooterLinks
	 * 
	 * @return List of Links
	 */
	List<Link> getFooterLinks();

	/**
	 * Method to return Copy right text
	 * 
	 * @return String
	 */
	String getCopyRightText();

	/**
	 * Method to return Terms of use Title
	 * 
	 * @return String
	 */
	String getTermsOfUseTitle();

	/**
	 * Method to return Terms of use Link
	 * 
	 * @return String
	 */
	String getTermsOfUseLink();

	/**
	 * Method to return Privacy Policy title
	 * 
	 * @return String
	 */
	String getPrivacyPolicyTitle();

	/**
	 * Method to return Privacy Policy Link
	 * 
	 * @return String
	 */
	String getPrivacyPolicyLink();

	/**
	 * Method to return Facebook Link
	 * 
	 * @return String
	 */
	String getFacebookLink();

	/**
	 * Method to return Linkedin Link
	 * 
	 * @return String
	 */
	String getLinkedinLink();

	/**
	 * Method to return Youtube Link
	 * 
	 * @return String
	 */
	String getYoutubeLink();

	/**
	 * Method to return Alt text
	 * 
	 * @return String
	 */
	String getAltText();
}
