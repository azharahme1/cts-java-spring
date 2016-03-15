package com.app.web;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class ProductFormValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		return arg0.equals(Product.class);
	}

	@Override
	public void validate(Object obj, Errors errors) {

		ValidationUtils.rejectIfEmpty(errors, "name", "product.name.required");
		
		//

	}

}
