package com.adobe.dramix.core.models.impl;

import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import com.adobe.dramix.core.models.Product;
import com.adobe.dramix.core.models.ProductDetail;

@Model(
		adaptables = Resource.class,
		adapters = Product.class,
		resourceType = ProductImpl.RESOURCE_TYPE,
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
	 )
public class ProductImpl implements Product {

	protected static final String RESOURCE_TYPE = "dramix/components/productComponent";

	/**
	 * @author karora044
     * Impl that list all the values of product item details
	 * @return list
	 */

	@ChildResource
	private List<ProductDetail> products;

	@Override
	public List<ProductDetail> getProductDetails() {
		return products;
	}   
}