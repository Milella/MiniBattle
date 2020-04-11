package com.minibattle;

import java.util.Random;


public class GameServices {

	public int rollD20() {
		int d20;
		Random random = new Random();
		d20 = random.nextInt(20)+1;
		System.out.println("Rolling D20 Die");
		return d20;
	}
	
	public void combat() {
		System.out.println("What do you want to do? " + character.getCharacterName());
		System.out.println("");
		System.out.println("Enter FIGHT, to FIGHT, Enter RUN to RUN, or enter DEFEND to Defend");
		return;
	}
	
	
}
