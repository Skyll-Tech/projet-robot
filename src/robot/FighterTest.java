package robot;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FighterTest {

	@Test
	void testFire() {
		Fighter a = new Fighter();
		Fighter b = new Fighter();
		
		a.fire(b);
	}

}
