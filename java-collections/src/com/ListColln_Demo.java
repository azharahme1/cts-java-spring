package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.entity.Product;

// ArrayList vs LinkedList

//class CompareList {
//	public void compare(List<String> list) {
//
//		long start = System.currentTimeMillis();
//		for (int i = 0; i < 10000; i++) {
//			list.add("Java " + i);
//		}
//		long end = System.currentTimeMillis();
//
//		System.out.println("time :" + ( end - start ));
//	}
//}

public class ListColln_Demo {

	public static void main(String[] args) {
		//
		// LinkedList<String> list = new LinkedList<String>();
		// list.add("A");
		// list.add("A");
		// list.add("B");
		// // list.add(12);
		//
		// System.out.println(list);

		// CompareList compareList=new CompareList();
		// compareList.compare(new ArrayList<>(10000));
		// compareList.compare(new LinkedList<>());

		// ---------------------------------------------

		Product product1 = new Product(324234, "Laptop", 148000);
		Product product2 = new Product(734566, "Apple", 48000);
		Product product3 = new Product(686787, "MOBILE", 28000);
		Product product4 = new Product(686787, "MOBILE", 28000);

		// -------------------------------------------------

		List<Product> products = new ArrayList<>();
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);

		// ---------------------------------------------------

		// display(products);

		// Collections.sort(products); // sort by 'natural property' e.g product
		// --> id ( uses java.lang.Comparable' )
		// display(products);

		// sort by product.name ( use 'java.util.Comparator' )

		// way-1
		// Collections.sort(products,new ProductsByName());

		// way-2
		// Collections.sort(products, new Comparator<Product>() {
		// public int compare(Product o1, Product o2) {
		// return o1.getName().compareTo(o2.getName());
		// };
		// });

		// way-3 : using Lambda expression
		Collections.sort(products, (o1, o2) -> {
			return o1.getName().compareTo(o2.getName());
		});

		display(products);

		// ---------------------------------------------------
	}

	private static void display(List<Product> products) {
		for (Product product : products) {
			System.out.println(product);
		}
	}

}

//
// class ProductsByName implements Comparator<Product> {
// @Override
// public int compare(Product o1, Product o2) {
// return o1.getName().compareTo(o2.getName());
// }
// }
