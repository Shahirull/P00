import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	//code executed before all test methods

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	//code executed after each test method
	}

	@Before
	public void setUp() throws Exception {
	//code executed before each test method
	}

	@After
	public void tearDown() throws Exception {
	//code executed after each test method
	}

	@Test	
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a,b);
		
		int expected = 9999;
		assertEquals (actual, expected);
	}
	
	@Test	
	public void testSubtract(){
			//fail("Not yet implemented");
			int a = 9876;
			int b = 4321;
			
			Calculator cal = new Calculator();
			int actual = cal.subtract(a, b);
			
			int expected = 5555;
			assertEquals(actual, expected);
	}
	
	@Test
	public void testMultiply() {
		int a = 12;
		int b = 34;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 408;
		assertEquals(actual, expected);
	}
	public void testDivide() {
		int a = 500;
		int b = 25;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 20;
		assertEquals(actual, expected);
	}

}



