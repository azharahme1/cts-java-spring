package com;

@FunctionalInterface
interface I1 {

	void a();

	default void b() {
		System.out.println("I1-b()");
	}

	static void bb() {
		System.out.println("I1-b()");
	}

}

interface I2 {
	void a();

	default void b() {
		System.out.println("I2-b()");
	}
}

class C implements I1, I2 {
	@Override
	public void a() {

	}

	public void b() {
		I1.super.b();
		I2.super.b();
	}
}

public class MultipleInheritance_Ex {

	public static void main(String[] args) {

		C c = new C();
		c.b();

	}

}
