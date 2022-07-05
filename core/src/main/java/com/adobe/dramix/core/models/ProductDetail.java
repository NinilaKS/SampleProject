package com.adobe.dramix.core.models;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author karora044
 */
public class ProductDetail {

	private static final Logger LOG = LoggerFactory.getLogger(ProductDetail.class);

	String questionText;
	String answerText;
	String buttonText;
	String buttonLink;
	
	/**
	 * @param resource
	 */
	public ProductDetail(Resource resource){
        try {
            if(StringUtils.isNotBlank(resource.getValueMap().get("questionText", String.class))) {
                this.questionText = resource.getValueMap().get("questionText", String.class);
            }
            if(StringUtils.isNotBlank(resource.getValueMap().get("answerText", String.class))) {
                this.answerText=resource.getValueMap().get("answerText",String.class);
            }
            if(resource.getValueMap().get("buttonText",String.class)!=null) {
                this.buttonText=resource.getValueMap().get("buttonText",String.class);
            }
            if(resource.getValueMap().get("buttonLink",String.class)!=null) {
                this.buttonLink=resource.getValueMap().get("buttonLink",String.class);
            }

        }catch (Exception e){
            LOG.info("\n BEAN ERROR : {}",e.getMessage());
        }

    }

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
