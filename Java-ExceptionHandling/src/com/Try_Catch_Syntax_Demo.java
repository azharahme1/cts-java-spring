package com;

class Employee {
	public void doWork() {
		System.out.println("Work....");
	}
}

public class Try_Catch_Syntax_Demo {

	public static void main(String[] args) {

		System.out.println("A");

		try {

			System.out.println("B");

			int ari = 1 / 0;

			int[] arr = { 1, 2, 3 };
			System.out.println(arr[0]);

			Employee e = null;
			// e.doWork();

			System.out.println("C");

		}

		// catch (ArithmeticException ae) {
		// System.out.println("Ex: ae");
		// System.out.println("D");
		// }

		// catch (ArrayIndexOutOfBoundsException aie) {
		// System.out.println("Ex: aioobe");
		// }

		// from JDK 1.6
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Ex -" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Ex: e " + e.getMessage());
		}

		System.out.println("E");

	}

}
