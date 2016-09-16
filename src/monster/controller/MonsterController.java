package monster.controller;

import monster.model.MarshmallowMonster;

import java.util.Scanner;

public class MonsterController 
{
	private MarshmallowMonster firstMonster;
	private Scanner keyboardInput;
	
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("Crusher of Dreams", 2, 2, 0, 3, true);
		keyboardInput = new Scanner(System.in);
	}
	
	public void start()
	{
		System.out.println("We made monsters today!");
		System.out.println("I am a monster." + firstMonster);
		System.out.println("My monster has this many legs " + firstMonster.getLegCount());
		System.out.println("My monster has this many eyes " + firstMonster.getEyeCount());
		System.out.println("My monster has this many noses " + firstMonster.getNoseCount());
		System.out.println("My monster has this many annteni " + firstMonster.getAntennaCount());
		System.out.println("My monster has this many bellybuttons " + firstMonster.getHasBellyButton());
		
		System.out.println("Would you like to change my name?");
		String answer = keyboardInput.nextLine();
		
		if (answer.equalsIgnoreCase("yes"))
		{
			System.out.println("What do you like the name to be?");
			String newName = keyboardInput.nextLine();
			firstMonster.setName(newName);
		}
		else
		{
			System.out.println("My name shall remain the same.");
		}
		
		System.out.println("Monster name is now" + firstMonster);
		keyboardInput.nextLine();
		
		System.out.println("Would you like to change my amount of eyes?");
		String eyeAnswer = keyboardInput.nextLine();
		
		if (eyeAnswer.equalsIgnoreCase("yes"))
		{
			System.out.println("How many eyes do I have?");
			int newEyes = keyboardInput.nextInt();
			firstMonster.setEyes(newEyes);
		}
		else
		{
			System.out.println("Eyes left unchanged.");
		}
		
		
		System.out.println("I now have " + firstMonster.getEyeCount() + " eyes.");
		keyboardInput.nextLine();
		
		System.out.println("Would you like to change my amount of legs?");
		String legAnswer = keyboardInput.nextLine();
		
		if (legAnswer.equalsIgnoreCase("yes"))
		{
			System.out.println("How many legs do I have?");
			int newLegs = keyboardInput.nextInt();
			firstMonster.setLegs(newLegs);
		}
		else
		{
			System.out.println("Legs remain unchanged");
		}
		
		System.out.println("I now have " + firstMonster.getLegCount() + " legs.");
		keyboardInput.nextLine();
		
		System.out.println("Would you like to change my nose count?");
		String noseAnswer = keyboardInput.nextLine();
		
		if(noseAnswer.equalsIgnoreCase("yes"))
		{
			System.out.println("How many noses do I have?");
			int newNose = keyboardInput.nextInt();
			firstMonster.setNose(newNose);
		}
		else
		{
			System.out.println("Nose count remains unchanged");
		}
		
		System.out.println("I now have " + firstMonster.getNoseCount() + " noses.");
		keyboardInput.nextLine();		
	}
}

