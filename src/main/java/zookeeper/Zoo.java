package zookeeper;

import java.util.Collection;
import java.util.HashMap;

public class Zoo {
	
	private HashMap<String, Animal> animals = new HashMap<String, Animal>();

	public void add(Animal animal) {
		animals.put(animal.getName(), animal);
	}

	public Collection<Animal> getAnimals() {
		return animals.values();
	}

	public Animal getAnimalByName(String name) {
		return animals.get(name);
	}

}
