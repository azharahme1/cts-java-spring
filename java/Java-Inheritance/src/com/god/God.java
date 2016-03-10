package com.god;

// "Closed for modification , open for extension "

import com.live.Animal;
import com.live.Human;
import com.live.LivingThing;

public class God {

	// public void manageHuman(Human human) {
	// human.eat();
	// human.sleep();
	// human.work();
	// }
	//
	// public void manageAnimal(Animal animal) {
	// animal.eat();
	// animal.sleep();
	// animal.work();
	// }
	//

	public void manageLT(LivingThing lt) {
		lt.eat();
		lt.sleep();
		lt.work();
	}

}
