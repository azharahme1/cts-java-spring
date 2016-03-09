package com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.entity.Product;

public class App {

	public static void main(String[] args) throws IOException {

		Product product = new Product(32323, "Laptop", 148000.00);

		//
		// serialization
		
		if(product instanceof Serializable){
			System.out.println("product is serializable instance..");
		}

		File file = new File("product.ser");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(product);

		oos.flush();
		oos.close();

		System.out.println("obj serialized...");

	}

}
