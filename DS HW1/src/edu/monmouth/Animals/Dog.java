package edu.monmouth.Animals;

public class Dog implements Animal {
	
	protected String furColor;
	
	public void setFurColor(String furColor)
	{
		this.furColor = furColor;
	}
	
	public String getFurColor()
	{
		return furColor;
	}
	
	@Override
	public String toString()
	{
		return "The dog's fur color is " + furColor + ".";
	}
	
	@Override
	public void move()
	{
		System.out.println("The dog is walking.");
	}
	
	@Override
	public void makeSound() 
	{
		System.out.println("The dog is barking.");
	}

}
