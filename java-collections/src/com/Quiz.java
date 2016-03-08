package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class NewCar {

	private String model;
	private String color;

	public NewCar(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
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
		NewCar other = (NewCar) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
	
	
}

class Owner {

	String name;

	public Owner(String name) {
		super();
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Owner other = (Owner) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	

}

public class Quiz {

	public static void main(String[] args) {

		NewCar car1 = new NewCar("Audi", "white");
		NewCar car2 = new NewCar("BMW", "black");

		Owner owner1 = new Owner("Nag");
		Owner owner2 = new Owner("Riya");

		// -------------------------------------

		Map<Owner, NewCar> map = new HashMap<>();
		map.put(owner1, car1);
		map.put(owner2, car2);

		// ----------------------------------------

		Scanner sc = new Scanner(System.in);
		System.out.println("enter owner name!");
		String name = sc.nextLine();

		Owner key = new Owner(name);  //

		NewCar car = map.get(key);
		if (car != null) {
			System.out.println(car);
		} else {
			System.out.println("dream it..");
		}
		
		sc.close();

	}

}
