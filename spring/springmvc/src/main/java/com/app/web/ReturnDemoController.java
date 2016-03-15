package com.app.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

//@Controller
public class ReturnDemoController {

	// @RequestMapping(value="/view")
	// public void h1() {
	// System.out.println("page1 req handled...");
	// }

	// @RequestMapping(value = "/req")
	// public String h2() {
	// System.out.println("page1 req handled...");
	// return "view";
	// }

	// way-1

	// @RequestMapping(value="/req")
	// public ModelAndView h3() {
	// System.out.println("req1 handled...");
	// ModelAndView mav=new ModelAndView();
	// mav.addObject("msg", "Spring MVC demo"); // req.setAttribute("msg",
	// "Spring MVC demo");
	// mav.setViewName("view");
	// return mav;
	// }

	// way-2

	// @RequestMapping(value = "/req")
	// public String h3(Model model) {
	// System.out.println("req1 handled...");
	// model.addAttribute("msg", "Spring MVC demo....");
	// return "view";
	// }

	// way -3

	// @RequestMapping(value = "/req")
	// public String h3(Map<String, String> model) {
	// System.out.println("req1 handled...");
	// model.put("msg", "Spring MVC demo....");
	// return "view";
	// }

	// ----------------------------------------------------

	// AJAX Request.. or REST client req

	// @RequestMapping(value = "/req")
	// @ResponseBody
	// public String h3(Model model) {
	// System.out.println("req1 handled...");
	// return "Hello Utkarsh";
	// }

	@RequestMapping(value = "/products",produces={"application/xml","application/json"})
	@ResponseBody
	public Product h3(Model model) {
		System.out.println("req1 handled...");
		Product product = new Product();
		product.setId(234234);
		product.setName("Laptop");
		product.setPrice(148000);
		product.setDescription("New Model");
		return product;
	}

}
