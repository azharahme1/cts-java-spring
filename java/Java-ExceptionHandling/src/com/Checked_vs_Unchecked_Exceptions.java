package com;

//------------------------------------------

class OtherModule {

	public void doWork() {
		throw new RuntimeException();
	}

}

// ------------------------------------------

class MyModule {

	public void someWork() {

		OtherModule otherModule = new OtherModule();
		otherModule.doWork();

	}
}

// -------------------------------------------

public class Checked_vs_Unchecked_Exceptions {

	public static void main(String[] args) {

		try {
			MyModule myModule = new MyModule();
			myModule.someWork();

		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}

}
