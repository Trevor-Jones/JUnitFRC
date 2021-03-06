package core;

import static org.junit.Assert.*;
import org.junit.Test;
import core.Drive;

public class DriveTest {

	@Test
	public void test() {
 		double[] answersLeft = {1,-.95,-1,0.6,1,0,-1,-.6,1,0.9,-1,-1};
		double[] answersRight = {-1,-1,0.81,1,-0.32,-1,-0.3,1,0.8,-1,-1,1};
		Drive drive = new Drive();
		for(int i = 0; i < 360; i+=30) {
			double[] leftRight = drive.drive(1, i);
			assertEquals(String.format("Wow, test number %d of the left side was incorrect.", (i/30)), answersLeft[i/30],leftRight[0],0.05);
			assertEquals(String.format("Wow, test number %d of the right side was incorrect.", (i/30)), answersRight[i/30],leftRight[1],0.05);
		}
	}
	
	@Test
	public void equalsTest() {
		assertEquals(0,0);
		assertEquals(2,2);
		assertEquals(5,5);
	}
}