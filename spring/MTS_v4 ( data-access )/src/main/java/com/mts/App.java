package com.mts;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mts.service.TxrService;

public class App {

	public static void main(String[] args) {

		// init
		ConfigurableApplicationContext applicationContext = null;
		applicationContext = new ClassPathXmlApplicationContext("classpath:appln-layer.xml", "infra-layer.xml");

		System.out.println("----------------------------------------------------------");

		// use
		TxrService txrService = applicationContext.getBean("txrService", TxrService.class);
		txrService.txr(1000.00, "1", "2");
		System.out.println("Txr success");
		
		System.out.println("----------------------------------------------------------");

		// destroy
		applicationContext.close();

	}

}
