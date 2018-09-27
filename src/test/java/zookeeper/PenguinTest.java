package zookeeper;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PenguinTest {

	@Test
	public void boredomShouldDecreaseFromSwimming() {
		Penguin penguin = new Penguin("Pip");
		int boredomBefore = penguin.getBoredom();
		penguin.swim();
		int boredomAfter = penguin.getBoredom();
		assertThat(boredomAfter, is(lessThan(boredomBefore)));
	}
}
