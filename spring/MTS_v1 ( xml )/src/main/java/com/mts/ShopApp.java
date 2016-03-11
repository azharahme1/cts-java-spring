package com.mts;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mts.service.TxrService;
import com.shop.service.ShoppingServiceImpl;

public class ShopApp {

	public static void main(String[] args) {

		// init
		ConfigurableApplicationContext applicationContext = null;
		applicationContext = new ClassPathXmlApplicationContext("classpath:shop-layer.xml");

		System.out.println("----------------------------------------------------------");

		// use
		ShoppingServiceImpl service = applicationContext.getBean("shopService", ShoppingServiceImpl.class);

		// ----------------------

		service.doNewShopping();
		service.doCheckout();

		System.out.println();

		service.doNewShopping();
		service.doCheckout();

		System.out.println("----------------------------------------------------------");

		// destroy
		applicationContext.close();

	}

}
