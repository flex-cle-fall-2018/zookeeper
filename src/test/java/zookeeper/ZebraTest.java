package zookeeper;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ZebraTest {

	@Test
	public void boredomShouldDecreaseFromRunning() {
		Zebra zebra = new Zebra("Zip");
		int boredomBefore = zebra.getBoredom();
		zebra.run();
		int boredomAfter = zebra.getBoredom();
		assertThat(boredomAfter, is(lessThan(boredomBefore)));
	}
}
