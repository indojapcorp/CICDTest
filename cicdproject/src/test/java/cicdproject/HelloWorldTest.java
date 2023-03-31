package cicdproject;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		assertEquals(6, HelloWorld.add(3,3));
	}

}
