package edu.monmouth.Animals;

public class Main {
	
	final static int ZOOSIZE = 6;
	
	public static void main(String[] args) {
		
		Animal zoo[];
		zoo = new Animal[ZOOSIZE];
		
		Fish fish = new Fish();
		fish.setColor("orange");
		
		Dog dog = new Dog();
		dog.setFurColor("white");
		
		GuardDog guardDog = new GuardDog();
		guardDog.setFurColor("black");
		guardDog.setMeanness((short)4);
		
		ShowDog showDog = new ShowDog();
		showDog.setFurColor("golden");
		showDog.setBreed("golden retiver");
		
		BigDog bigDog = new BigDog();
		bigDog.setFurColor("black");
		bigDog.setBreed("dobermann");
		
		SmallDog smallDog = new SmallDog();
		smallDog.setFurColor("white");
		smallDog.setBreed("maltese");
		
	       zoo[0] = fish;
	       zoo[1] = dog;
	       zoo[2] = guardDog;
	       zoo[3] = showDog;
	       zoo[4] = bigDog;
	       zoo[5] = smallDog;
	       
	       
	       for (Animal animal : zoo) 
	        {
	            System.out.println(animal);
	            animal.move();
	            animal.makeSound();
	        }
	       
	       for (int i = 0; i < zoo.length; i++)

	       {
	            zoo[i].move();
	            zoo[i].makeSound();
	       }
	       
	       int i = 0;
	       while (i == zoo.length) 
	       {
	    	   zoo[i].move();
	           zoo[i].makeSound();
	       }
	

	}

}
