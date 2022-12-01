package robot;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArenaTest {

	@Test
	void testFigth() {
		Robot r1 = new Robot("Apple",10);
		Robot r2 = new Robot("Tesla", 10);
		Arena A = new Arena(r1, r2);
		
		A.figth(r1, r2);
	}

}
