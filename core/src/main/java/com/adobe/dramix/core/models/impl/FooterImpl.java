package com.adobe.dramix.core.models.impl;

import java.util.List;

import javax.inject.Named;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.dramix.core.models.Footer;

@Model(adaptables = Resource.class, adapters = Footer.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL, resourceType = "dramix/components/footer")
public class FooterImpl implements Footer {
	@ValueMapValue
	private String footerLogo;

	@ChildResource
	@Named("footerlinks")
	private List<Link> links;

	@ValueMapValue
	private String copyRight;

	@ValueMapValue
	private String termsOfUseTitle;

	@ValueMapValue
	private String termsOfUseLink;

	@ValueMapValue
	private String privacyPolicyTitle;

	@ValueMapValue
	private String privacyPolicyLink;

	@ValueMapValue
	private String fbLink;

	@ValueMapValue
	private String linkedinLink;

	@ValueMapValue
	private String youtubeLink;

	@ValueMapValue
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
