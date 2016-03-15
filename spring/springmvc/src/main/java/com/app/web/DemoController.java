package com.app.web;

import java.security.Principal;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller
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

	// Reading XML and JSON Data

	@RequestMapping(value = "/products", method = RequestMethod.POST, consumes = { "application/xml","application/json" })
	@ResponseBody
	public String saveProduct(@RequestBody Product product) {
		System.out.println("accepting XML/JSON input....");
		System.out.println("POST: /products req handled....");
		System.out.println(product);
		return "success";
	}


	@RequestMapping(value = "/e", method = RequestMethod.GET)
	@ResponseBody
	public String handler6(HttpServletRequest req, HttpServletResponse resp, HttpSession session) {
		System.out.println("GET: /e req handled....");
		return "success";
	}

	@RequestMapping(value = "/f", method = RequestMethod.GET)
	@ResponseBody
	public String handler7(@CookieValue String JSESSIONID) {
		System.out.println("GET: /f req handled....");
		return "success";
	}

	@RequestMapping(value = "/g", method = RequestMethod.GET)
	@ResponseBody
	public String handler8(Locale locale) {
		System.out.println("GET: /g req handled...." + locale.getLanguage());
		return "success";
	}

	@RequestMapping(value = "/sec", method = RequestMethod.GET)
	@ResponseBody
	public String handler9(Principal principal) {
		// System.out.println(principal.getName());
		System.out.println("GET: /sec req handled....");
		return "success";
	}

}
