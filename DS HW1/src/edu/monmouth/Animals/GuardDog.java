package edu.monmouth.Animals;

public class GuardDog extends Dog {
	
	private short meanness;
	
	public void setMeanness( short meanness)
	{
		this.meanness = meanness;
	}
	
	public short getMeanness() 
	{
		return meanness;
	}
	
	@Override
	public String toString()
	{
		return "The guard dog's fur color is " + furColor + ". The meanness is a " + meanness + ".";
	}

}
