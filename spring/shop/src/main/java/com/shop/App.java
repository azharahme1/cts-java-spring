package com.shop;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shop.bill.Billing;

public class App {

	public static void main(String[] args) {

		// Init - / Container

		ConfigurableApplicationContext applicationContext = null;
		applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		// Use
		String[] cart = { "2424", "34534" };
		Billing billComp = applicationContext.getBean("billComp1", Billing.class);
		double totalPrice = billComp.getTotalPrice(cart);
		System.out.println("TotalPrice : " + totalPrice);

		// Destroy
		// ...
		applicationContext.close();

	}

}
