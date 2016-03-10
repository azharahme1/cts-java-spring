package com;

import java.util.Scanner;

public class Arith {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num-1");
		int n1 = sc.nextInt();

		System.out.println("Enter num-2");
		int n2 = sc.nextInt();

		System.out.println("1.Add");

		System.out.println("2.Sub");

		try{
			System.out.println("3.Div");
			int r = n1 / n2;
		}catch(ArithmeticException e){
			
			// handle
			
			/*
			 *  --> report to end-user , ( with friendly message )
			 *  --> log it 
			 *  --> re-thow exception to other module
			 *  
			 *  --> display error-page with error message ( for web-app )
			 * 
			 */
			
			
		}

		System.out.println("4.Mul");

		sc.close();
		System.out.println("Happy end...");

	}

}
