package com.webex;

public class WebexTraining implements Webex {

	public void doTng() {

		System.out.println("Webex - training.......start");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Webex - training.......End");

	}

}
