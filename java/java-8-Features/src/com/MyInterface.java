package com;

public interface MyInterface {

	// immutable state

	void a();

	void b();

	// default method(s)
	public default void c() {
		// logic...
	}

	// static method(s)
	public static void d() {
		// logic
	}
}
