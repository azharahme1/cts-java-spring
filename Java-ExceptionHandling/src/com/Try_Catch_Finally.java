package com;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Resource implements Closeable {

	public Resource() {
		init();
	}

	public void init() {
		System.out.println("init..");
	}

	public void use() {
		System.out.println("use..");
		throw new RuntimeException("ooops");
	}

	public void close() {
		System.out.println("close..");
	}

}

public class Try_Catch_Finally {

	public static void main(String[] args) {

		try (Resource resource = new Resource(); FileReader fr = new FileReader("somefile.txt")) {

			resource.use();
			return;
			// resource.close();

		} catch (RuntimeException e) {
			// resource.close();
			System.out.println("Ex- " + e.getMessage());
		}
		// finally {
		// resource.close();
		// }
		catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
