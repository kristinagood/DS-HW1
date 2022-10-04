package edu.monmouth.Animals;

public class Fish implements Animal {
	
	protected String color;
	
	public void setColor(String color) 
	{
		this.color = color;
	}
	
	public String getColor()
	{
		return color;
	}
	
	@Override
	public String toString()
	{
		return "The fish's color is " + color + ".";
	}
	
	@Override
	public void move()
	{
		System.out.println("The fish is swimming.");
	}
	
	@Override
	public void makeSound() 
	{
		System.out.println("The fish is making bubbles.");
	}


}
