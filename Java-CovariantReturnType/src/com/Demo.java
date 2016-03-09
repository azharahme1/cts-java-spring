package com;

interface Product {

}

class Mobile implements Product {

}

class Laptop implements Product {

}

interface Manufacture {
	Product getProduct();
}

//
class AppleMobile implements Manufacture {

	public Mobile getProduct() { // co-variant return type

		Mobile mobile = new Mobile();
		return mobile;

	}

}

class AppleLap implements Manufacture {

	public Laptop getProduct() { // co-variant return type

		Laptop laptop = new Laptop();
		return laptop;
		
	}

}

public class Demo {

	public static void main(String[] args) {

		AppleMobile appleMobile = new AppleMobile();
		Mobile mobile = appleMobile.getProduct();

	}

}
