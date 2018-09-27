package zookeeper;

import java.util.Scanner;

public class ZooApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Zoo zoo = new Zoo();
		Animal penguin = new Penguin("Pip");
		Animal zebra = new Zebra("Zip");
		zoo.add(penguin);
		zoo.add(zebra);

		System.out.println("Here are the animals in the zoo:");
		for (Animal animal : zoo.getAnimals()) {
			System.out.println(animal.getName() + " [Hunger = " + animal.getHunger() + "]");
		}
		
		System.out.println("Which animal would you like to feed?");
		String animalName = input.nextLine();
		Animal selectedAnimal = zoo.getAnimalByName(animalName);
		selectedAnimal.receiveFood();
		System.out.println("You gave food to " + selectedAnimal.getName() + ". It looks happy.");
		
		System.out.println("Here are the animals in the zoo:");
		for (Animal animal : zoo.getAnimals()) {
			System.out.println(animal.getName() + " [Hunger = " + animal.getHunger() + "]");
		}
		
		input.close();
	}
	
}
