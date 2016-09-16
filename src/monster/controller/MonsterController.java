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
		System.out.println("Here is mine " + firstMonster);
		System.out.println("My monster has this many legs " + firstMonster.getLegCount());
		System.out.println("My monster has this many eyes " + firstMonster.getEyeCount());
		System.out.println("My monster has this many noses " + firstMonster.getNoseCount());
		System.out.println("My monster has this many annteni " + firstMonster.getAntennaCount());
		System.out.println("My monster has this many bellybuttons " + firstMonster.getHasBellyButton());
		
		System.out.println("Would you like to change my name?");
		String answer = keyboardInput.nextLine();
	}
	
	
}
