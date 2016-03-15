package com.app.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

	// by HTTP-method

	@RequestMapping(value = "/a", method = RequestMethod.GET)
	@ResponseBody
	public String handler1() {
		System.out.println("GET: /a req handled....");
		return "success";
	}

	@RequestMapping(value = "/a", method = RequestMethod.POST)
	@ResponseBody
	public String handler2() {
		System.out.println("POST: /a req handled....");
		return "success";
	}

	// ----------------------------------------------------------

	// by param(s)

	@RequestMapping(value = "/b", method = RequestMethod.GET, params = { "!param1", "param2=123" })
	@ResponseBody
	public String handler3() {
		System.out.println("GET: /b req handled....");
		return "success";
	}

	// ----------------------------------------------------------

	// by headers

	@RequestMapping(value = "/c", method = RequestMethod.GET, headers = { "Accept-Language!=ar" })
	@ResponseBody
	public String handler4() {
		System.out.println("GET: /c req handled....");
		return "success";
	}

	// ----------------------------------------------------------

	// Supported method argument types

	// ex- query param(s)
	@RequestMapping(value = "/d")
	@ResponseBody
	public String handler5(@RequestParam(name = "param1", required = false, defaultValue = "1") String param) {
		System.out.println("GET: /d req handled...." + param);
		return "success";
	}

	// ex - path param(s)
	@RequestMapping(value = "/customers/{custID}/accounts/{accID}")
	@ResponseBody
	public String handler5(@PathVariable(value = "custID") String custId, @PathVariable("accID") String accId) {
		System.out.println("GET: /... req handled....");
		System.out.println(custId);
		System.out.println(accId);
		return "success";
	}

	// Reading Form Data

	// @RequestMapping(value = "/products", method = RequestMethod.POST)
	// @ResponseBody
	// public String saveProduct(@ModelAttribute Product product) {
	// System.out.println("POST: /products req handled....");
	// System.out.println(product);
	// return "success";
	// }

	// ------------------

	@RequestMapping(value = "/products", method = RequestMethod.POST,consumes="application/xml")
	@ResponseBody
	public String saveProductXML(@RequestBody Product product) {
		System.out.println("accepting XML input....");
		System.out.println("POST: /products req handled....");
		System.out.println(product);
		return "success";
	}
	
	@RequestMapping(value = "/products", method = RequestMethod.POST,consumes="application/json")
	@ResponseBody
	public String saveProductJSON(@RequestBody Product product) {
		System.out.println("accepting JSON input....");
		System.out.println("POST: /products req handled....");
		System.out.println(product);
		return "success";
	}

}
