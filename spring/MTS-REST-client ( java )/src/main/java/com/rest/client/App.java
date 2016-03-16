package com.rest.client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class App {

	public static void main(String[] args) {

		String uri = "http://localhost:8080/mts/txr";

		String fromAccNum = "1";
		String toAccNum = "2";
		double amount = 100.00;

		// ----------------------------

		TxrRequest request = new TxrRequest();
		request.setFromAccNum(fromAccNum);
		request.setToAccNum(toAccNum);
		request.setAmount(amount);

		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<TxrResponse> response = restTemplate.postForEntity(uri, request, TxrResponse.class);
		System.out.println(response.getBody().getMessage());

	}

}
