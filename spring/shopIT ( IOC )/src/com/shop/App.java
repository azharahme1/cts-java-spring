package com.shop;

import com.shop.bill.Billing;
import com.shop.bill.BillingImpl;
import com.shop.pm.PriceMatrix;
import com.shop.pm.PriceMatrixImpl_v1;
import com.shop.pm.PriceMatrixImpl_v2;

public class App {

	public static void main(String[] args) {

		// Init -  / Container
		
		PriceMatrix priceMatrixV1 = new PriceMatrixImpl_v1();
		PriceMatrix priceMatrixV2 = new PriceMatrixImpl_v2();

		Billing billComp = new BillingImpl(priceMatrixV2);

		// Use
		String[] cart = { "2424", "34534" };
		double totalPrice = billComp.getTotalPrice(cart);
		System.out.println("TotalPrice : " + totalPrice);

		// Destroy
		// ...

	}

}
