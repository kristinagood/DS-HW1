package edu.monmouth.Animals;

public class SmallDog extends Dog {
	
	private String breed;
	
	public void setBreed(String breed)
	{
		this.breed = breed;
	}
	
	public String getBreed()
	{
		return breed;
	}
	
	@Override
	public String toString()
	{
		return "The small dog's fur color is " + furColor + ". The breed is a " + breed + ".";
	}
}
