package com;

import java.util.ArrayList;
import java.util.List;

class Super {
	public void abc() {
		System.out.println("Super::abc()");
	}
}

class Sub extends Super {

	// override
	@Override
	public void abc() {
		System.out.println("Sub::abc()");
	}

	@Deprecated
	public void v1() {
		System.out.println("v1()...");
	}

	public void v2() {
		System.out.println("v2()");
	}

}

public class Annotation_Demo {

	public static void main(String[] args) {

		Sub sub = new Sub();
		sub.abc();

		sub.v1();

		// -------------------

		@SuppressWarnings("rawtypes")
		List list = new ArrayList();

	}

}
