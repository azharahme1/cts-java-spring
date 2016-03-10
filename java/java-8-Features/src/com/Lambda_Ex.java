package com;

interface Adder {
	int add(int x, int y);
}

interface Joiner {
	String join(String s1, String s2);
}

public class Lambda_Ex {

	public static void main(String[] args) {
		
		System.out.println(getSum((a,b)->a+b));
		System.out.println(getString((a,b)->a+b));

	}

	public static int getSum(Adder adder) {
		return adder.add(12, 12);
	}

	public static String getString(Joiner joiner) {
		return joiner.join("hello", "world");
	}

}
