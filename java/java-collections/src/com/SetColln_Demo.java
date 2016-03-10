package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.entity.Product;

public class SetColln_Demo {
	public static void main(String[] args) {

		Product product1 = new Product(324234, "Laptop", 148000);
		Product product2 = new Product(734566, "Apple", 48000);
		Product product3 = new Product(686787, "MOBILE", 28000);
		Product product4 = new Product(686787, "MOBILE", 28000);

		// -------------------------------------------------

		Set<Product> products = new TreeSet<>(new Comparator<Product>() {
			@Override
			public int compare(Product o1, Product o2) {
				if (o2.getId() == o1.getId()) {
					return 0;
				} else if (o2.getId() > o1.getId()) {
					return 1;
				} else {
					return -1;
				}
			}
		});
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);

		display(products);

		// ---------------------------------------------------
	}

	private static void display(Set<Product> products) {
		for (Product product : products) {
			System.out.println(product);
		}
	}

}
