package zookeeper;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AnimalTest {

	@Test
	public void shouldBeAbleToCreateAnimal() {
		Animal penguin = new Penguin("Pip");
		assertTrue(penguin instanceof Animal);
	}

	@Test
	public void shouldBeAbleToGetName() {
		Animal penguin = new Penguin("Pip");
		String name = penguin.getName();
		assertThat(name, is("Pip"));
	}
	
	@Test
	public void shouldBeAbleToCreateDifferentAnimals() {
		Animal zebra = new Zebra("Zip");
		Animal penguin = new Penguin("Pip");
		assertTrue(zebra instanceof Animal);
		assertTrue(penguin instanceof Animal);
	}
	
	@Test
	public void hungerShouldStartAt0() {
		Animal penguin = new Penguin("Pip");
		int hunger = penguin.getHunger();
		assertThat(hunger, is(0));
	}
	
	@Test
	public void hungerShouldIncreaseOverTime() {
		Animal penguin = new Penguin("Pip");
		int hungerBefore = penguin.getHunger();
		penguin.tick();
		int hungerAfter = penguin.getHunger();
		assertThat(hungerAfter, is(greaterThan(hungerBefore)));
	}
	
	@Test
	public void thirstShouldStartAt0() {
		Animal zebra = new Zebra("Zip");
		int thirst = zebra.getThirst();
		assertThat(thirst, is(0));
	}
	
	@Test
	public void thirstShouldIncreaseOverTime() {
		Animal zebra = new Zebra("Zip");
		int thirstBefore = zebra.getThirst();
		zebra.tick();
		int thirstAfter = zebra.getThirst();
		assertThat(thirstAfter, is(greaterThan(thirstBefore)));
	}

	@Test
	public void hungerShouldDecreaseWhenFed() {
		Animal zebra = new Zebra("Zip");
		int hungerBefore = zebra.getHunger();
		zebra.receiveFood();
		int hungerAfter = zebra.getHunger();
		assertThat(hungerAfter, is(lessThan(hungerBefore)));
	}

	@Test
	public void thirstShouldDecreaseWhenWatered() {
		Animal penguin = new Penguin("Pip");
		int thirstBefore = penguin.getThirst();
		penguin.receiveWater();
		int thirstAfter = penguin.getThirst();
		assertThat(thirstAfter, is(lessThan(thirstBefore)));
	}
}
