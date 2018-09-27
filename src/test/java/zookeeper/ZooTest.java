package zookeeper;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class ZooTest {

	@Test
	public void shouldBeAbleToAddAnimals() {
		Zoo zoo = new Zoo();
		Animal penguin = new Penguin("Pip");
		Animal zebra = new Zebra("Zip");
		zoo.add(penguin);
		zoo.add(zebra);
		
		Collection<Animal> animals = zoo.getAnimals();
		
		assertThat(animals, containsInAnyOrder(penguin, zebra));
	}
	
	@Test
	public void shouldBeAbleToGetAnimalByName() {
		Zoo zoo = new Zoo();
		Animal penguin = new Penguin("Pip");
		Animal zebra = new Zebra("Zip");
		zoo.add(penguin);
		zoo.add(zebra);

		Animal pip = zoo.getAnimalByName("Pip");
		Animal zip = zoo.getAnimalByName("Zip");
		
		assertThat(pip, is(penguin));
		assertThat(zip, is(zebra));
	}
	
}
