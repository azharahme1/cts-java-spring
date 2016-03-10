package com.shop;

import com.shop.bill.BillingImpl;

public class App {

	public static void main(String[] args) {

		// Init
		BillingImpl billComp = new BillingImpl();

		// Use
		String[] cart = { "2424", "34534" };
		double totalPrice = billComp.getTotalPrice(cart);
		System.out.println("TotalPrice : " + totalPrice);

		// Destroy
		// ...

	}

}
