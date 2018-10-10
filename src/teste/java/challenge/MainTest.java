package teste.java.challenge;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;

import main.java.challenge.Main;
import main.java.challenge.State;

class MainTest {

	@Test
	void test() {
		List<State> states = new Main().listThe10largestStatesInBrazil();

		assertNotNull(states);
		assertEquals(10, states.size());
	}

}
