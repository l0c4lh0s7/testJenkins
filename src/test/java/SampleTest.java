import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SampleTest {

	@Test
	public void simpleTestPass() {
		int a = 1;
		int b = 2;
		assertTrue( a + b == 3 );
	}
	
	
	// Its a failed test 
	@Test
	public void simpleTestFail() {
		int a = 1;
		int b = 2;
		assertFalse( a + b == 4 );
	}
	
	
	
}
