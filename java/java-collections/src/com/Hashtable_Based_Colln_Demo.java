package com;

import java.util.HashSet;
import java.util.Set;

/*  
 *  hashtable
 *  -----------------
 *  hashcode | Data
 *  -----------------
 *  |   0   | meals
 *  |       |
 *  |  2    | biryani
 *  
 *  
 *  Data --> using hashing-algorithm  --> hashcode
 *  
 *  biryani  --> 2
 *  meals    --> 0
 *  
 *  ----------------------------------
 *  
 *  
/*
 *  collections which implements 'hashtable' DS
 *  
 *  
 *  HashSet
 *  LinkedHashSet
 *  
 *  HashMap
 *  LinkedHashmap
 *  
 *  Hastable  
 * 
 * 
 * -------------------------------------
 */

class Car {

	private String model;
	private String color;

	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + "]";
	}

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	

}

public class Hashtable_Based_Colln_Demo {

	public static void main(String[] args) {

		Car car1 = new Car("Audi", "white");
		Car car2 = new Car("BMW", "black");

		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());

		System.out.println(car1.equals(car2));

		Set<Car> cars = new HashSet<>();
		cars.add(car1);
		cars.add(car2);

		System.out.println(cars.size());
		
		System.out.println(cars);

	}

}
