package robot;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RobotTest {

	@Test
	void testFire() {
		Robot a = new Robot();
		Robot b = new Robot();
		
		a.fire(b);
	}

}
