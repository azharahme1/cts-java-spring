package com;

import com.myutil.LinkedList;

public class App {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		//list.add(12);
		
		System.out.println(list.size());
	}

}
