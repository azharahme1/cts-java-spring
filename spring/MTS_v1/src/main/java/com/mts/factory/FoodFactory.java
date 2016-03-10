package com.mts.factory;

interface FoodService {

}

class VegService implements FoodService {

}

class NonVegService implements FoodService {

}

public class FoodFactory {

	public static FoodService getFood(String type) {

		// based config..
		if (type.equals("veg")) {
			VegService veg = new VegService();
			return veg;
		}
		if (type.equals("nonveg")) {
			NonVegService nonVeg = new NonVegService();
			return nonVeg;
		}

		return null;

	}
	
	
	public FoodService getInstance() {
		return null;
	}

}
