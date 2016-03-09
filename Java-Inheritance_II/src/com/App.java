package com;

import java.util.ArrayList;

import com.god.God;
import com.live.Animal;
import com.live.Human;
import com.live.LivingThing;
import com.live.Robot;



/*
 *  recommended class-hierarchy design
 *  --------------------------------
 *  
 *  
 *  Module -1                                        			    Module-2
 *  --------------------------------------          		       -------------------
 *  
 *  Top-Level : Interfaces
 *  
 *  Middle-Level : Abstract Classes  ( if required ( inheritance )
 *  
 *  Bottom -Level : Concrete Classes
 *  
 *  
 * 
 */



public class App {

	public static void main(String[] args) {

		// Init
		God god = new God();

		// Use

		Human human = new Human();
		Animal animal = new Animal();
		Robot robot = new Robot();
		
		
		// LivingThing live=new LivingThing();
		// god.manageLT(live);
		
		

		// god.manageHuman(human);
		god.manageLT(human);
		System.out.println();
		// god.manageAnimal(animal);
		god.manageLT(animal);
		System.out.println();
		god.manageLT(robot);
		
		
		//---------------------
		
		ArrayList<String> list=new ArrayList<>();

	}

}
