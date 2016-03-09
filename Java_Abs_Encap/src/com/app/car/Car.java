package com.app.car;

import com.app.wheel.Wheel;

// dependent ----> HAS-A  --> dependency

//   Car                       MRFWheel

//-----------------------------------------

/*
 *  OO principle
 *  
 *  " closed for modification , open for Extension "
 *  
 *  
 * 
 *  design issues
 *  -------------
 *  
 *  --> tight-coupling
 *  
 *      cause : maintenance difficult , 
 *              can't extend with new-things , 
 *              Unit-Testing Not possible ,
 *              Dev slow
 *  
 *    soln :
 *    
 *         use interface of 'dependency'  for loose-couling
 * 
 */

public class Car {

	private Wheel wheel;

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public void move() {
		wheel.rotate();   // Runtime polymorphism
		System.out.println("Car Moving...");
	}

}
