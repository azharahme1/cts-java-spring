package com;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.entity.Product;

public class AnotherApp {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("product.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Object obj = ois.readObject();
		Product product = (Product) obj;

		System.out.println(product);

		ois.close();

	}

}
