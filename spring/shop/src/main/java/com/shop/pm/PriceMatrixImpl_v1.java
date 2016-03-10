package com.shop.pm;

public class PriceMatrixImpl_v1 implements PriceMatrix {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shop.pm.PriceMatrix#getPrice(java.lang.String)
	 */
	@Override
	public double getPrice(String item) {
		// from DB or WS call
		return 100.00;
	}

}
