package monster.model;

public class MarshmallowMonster
{
	private String name;
	private double antennaCount;
	private int eyeCount;
	private int legCount;
	private int noseCount;
	private boolean hasBellyButton;
	
	public MarshmallowMonster()
	{
		this.name = "no name";
		this.antennaCount = -228282.45;
		this.eyeCount = -12;
		this.legCount = -2231;
		this.noseCount = -2;
		this.hasBellyButton = false;
	}
	
	public MarshmallowMonster(String name, double antennaCount, int eyeCount, int legCount, int noseCount, boolean hasBellyButton)
	
	{
	
		this.name = name;
		this.antennaCount = antennaCount;
		this.eyeCount = eyeCount;
		this.legCount = legCount;
		this.noseCount = noseCount;
		this.hasBellyButton = hasBellyButton;
	}
	
	public String toString()
	{
		String description = " My name is " + name;
		
		return description;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean getHasBellyButton()
	{
		return hasBellyButton;
	}
	
	public int getLegCount()
	{
		return legCount;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public int getNoseCount()
	{
		return noseCount;
	}
	
	public double getAntennaCount()
	{
		return antennaCount;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAntenna(double antenna)
	{
		this.antennaCount = antenna;
	}
	
	public void setNose(int nose)
	{
		this.noseCount = nose;
	}
	
	public void setLegs(int legs)
	{
		this.legCount = legs;
	}
	
	public void setBellyButton(boolean bellyButton)
	{
		this.hasBellyButton = bellyButton;
	}
	
	public void setEyes(int eyes)
	{
		this.eyeCount = eyes;
	}
	
}

