package com.shop.bill;

import com.shop.pm.PriceMatrix;

/*
 *  OO principle : " closed for modification , open for extension "
 *  
 *  
 * 
 *   design & performance issue(s)
 *   ------------------------------
 *   
 *   
 *   1. tight-coupling
 *   
 *      -> maintenance issues , cant extend with new features , ..
 *   
 *         soln : user interface of dependendency
 *   
 *   2. too many dependencies
 *   
 *       -> memory , slow , too many resources , ....
 *   
 *   3. unit-testing Not possible
 *   
 *       -> bug fix & dev slow
 *   
 *  --------------------------------------------
 *  
 *  why these issues in this comp ?
 *  
 *  -> dependent itself creating its own dependency.
 *  
 *  soln :
 *  
 *  --> dont create , do 'lookup'
 *  
 *  
 *  limitation on 'lookup'
 *  
 *  --> location tight-coupling
 *  
 *  best soln :
 *  
 *  dont create , dont lookup , inject/get thru 'some-one'   ( IOC )
 *  
 *  
 *  how to implement IOC ?
 *  
 *   by 'Dependency Injection' ( DI )
 *   
 *       types of DI
 *       
 *       -> constructor DI
 *       -> setter DI
 *  
 *  ---------------------------------------------------------
 */

public class BillingImpl implements Billing {

	private PriceMatrix priceMatrix = null;

	public BillingImpl(PriceMatrix priceMatrix) {
		this.priceMatrix = priceMatrix;
	}

	@Override
	public double getTotalPrice(String[] cart) {

		double total = 0.0;

		for (String item : cart) {
			total += priceMatrix.getPrice(item);
		}

		return total;
	}

}
