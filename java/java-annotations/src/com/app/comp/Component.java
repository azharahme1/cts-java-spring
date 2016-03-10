package com.app.comp;

import com.vendor.container.URLMapping;


//@Controller
public class Component {

	// @URLMapping(url = "/get")
	public void get() {
		System.out.println("URL: /get processed");
	}

	@URLMapping(url = "/post")  // @RequestMapping
	public void post() {
		System.out.println("URL: /post processed");
	}

	@URLMapping(url = "/get")
	public void get_new() {
		System.out.println("URL: /get processed - new");
	}

}
