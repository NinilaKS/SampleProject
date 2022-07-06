package com.adobe.dramix.core.models.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import com.adobe.dramix.core.models.Footer;

@Model(adaptables = Resource.class, adapters = Footer.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL, resourceType = "dramix/components/footer")
public class FooterImpl implements Footer {
	@Inject
	private String footerLogo;

	@Inject
	@Named("footerlinks")
	private List<Link> links;

	@Inject
	private String copyRight;

	@Inject
	private String termsOfUseTitle;

	@Inject
	private String termsOfUseLink;

	@Inject
	private String privacyPolicyTitle;

	@Inject
	private String privacyPolicyLink;

	@Inject
	private String fbLink;

	@Inject
	private String linkedinLink;

	@Inject
	private String youtubeLink;

	@Inject
	private String logoAlt;

	@Override
	public String getLogoPath() {
		return footerLogo;
	}

	@Override
	public List<Link> getFooterLinks() {
		return links;
	}

	@Override
	public String getCopyRightText() {
		return copyRight;
	}

	@Override
	public String getTermsOfUseTitle() {
		return termsOfUseTitle;
	}

	@Override
	public String getTermsOfUseLink() {
		return termsOfUseLink;
	}

	@Override
	public String getPrivacyPolicyTitle() {
		return privacyPolicyTitle;
	}

	@Override
	public String getPrivacyPolicyLink() {
		return privacyPolicyLink;
	}

	@Override
	public String getFacebookLink() {
		return fbLink;
	}

	@Override
	public String getLinkedinLink() {
		return linkedinLink;
	}

	@Override
	public String getYoutubeLink() {
		return youtubeLink;
	}

	@Override
	public String getAltText() {
		return logoAlt;
	}

}
