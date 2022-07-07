package com.adobe.dramix.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

/**
 * @author karora044
 */

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ProductDetail {


	@ValueMapValue
	String questionText;
	
	@ValueMapValue
	String answerText;
	
	@ValueMapValue
    String buttonText;
	
	@ValueMapValue
	String buttonLink;

	public String getQuestionText() {
		return questionText;
	}
	public String getAnswerText() {
		return answerText;
	}
	public String getButtonText() {
		return buttonText;
	}
	public String getButtonLink() {
		return buttonLink;
	}

}
