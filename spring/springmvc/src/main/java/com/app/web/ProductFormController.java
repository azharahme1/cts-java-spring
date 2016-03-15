package com.app.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductFormController {

	@Autowired
	private ProductFormValidator productFormvalidator;

	@RequestMapping(value = "/item", method = RequestMethod.GET)
	public String showForm(Model model) {
		System.out.println("showing product from");
		Product product = new Product();
		product.setId(3234234);
		model.addAttribute("product", product);
		return "productForm";
	}

	@RequestMapping(value = "/item", method = RequestMethod.POST)
	public String save(@ModelAttribute @Valid Product product, BindingResult result) {

		//productFormvalidator.validate(product, result);

		if (result.hasErrors()) {
			return "productForm";
		}
		
		System.out.println(product);
		System.out.println("saved....");
		product = new Product();
		return "productForm";
	}

}
