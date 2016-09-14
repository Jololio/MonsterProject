package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController 
{
	private MarshmallowMonster firstMonster;
	
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("Crusher of Dreams", 2, 2, 0, 3, true);
		
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
	}
	
	/*
	 * monster name is Crusher of Dreams
	 * has 2 antennai
	 * has 2 legs
	 * has no nose
	 * has 3 eyes
	 * 1 bellybutton
	 */
}
