package com.minibattle;

import java.util.Scanner;

public class APPCore {

	public static void main(String[] args) {
		GameServices gameServices = new GameServices();
		
		String name = "Adventurer";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to Mini Battle!");
		System.out.println("");
		System.out.println("Please enter your name adventurer:");
		System.out.println("");
		
		name = scanner.nextLine();
		
		Character character = new Character();
		character.setCharacterName(name);
		
		System.out.println("");
		System.out.println("Welcome Adventurerer " + character.getCharacterName());
		gameServices.combat();
		
		
		System.out.println("You have Encountered a MONSTER!");
		System.out.println("");
		System.out.println("What do you want to do?");
		System.out.println("");
		System.out.println("Enter FIGHT, to FIGHT, Enter RUN to RUN, or enter DEFEND to Defend");
	}	

		
		
		public void combat() {
			System.out.println(("What do you want to do? " + (character.getCharacterName());
			System.out.println("What do you want to do? " + character.getCharacterName();
			System.out.println(("What do you want to do? " +((character.getCharacterName())                           );
			System.out.println("");
			System.out.println("Enter FIGHT, to FIGHT, Enter RUN to RUN, or enter DEFEND to Defend");
			return;
		}

	

}
