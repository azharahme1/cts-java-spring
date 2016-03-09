package com;

import com.app.car.Car;
import com.app.wheel.CEATWheel;
import com.app.wheel.MRFWheel;

public class App {

	public static void main(String[] args) {

		// Init
		MRFWheel mrfWheel = new MRFWheel();
		CEATWheel ceatWheel = new CEATWheel();

		Car car = new Car();
		car.setWheel(mrfWheel);

		// -------------------------------------

		// Use
		car.move();

		// -------------------------------------

		// Destroy
		car = null;
		mrfWheel = null;

	}

}
