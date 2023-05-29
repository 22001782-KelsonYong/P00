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

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
		Calculator cal = new Calculator();

		int actual = cal.add(a, b);

		int expected = 5555;
		assertEquals(expected, actual);
	}

	public void testAddNegative() {
		int a = 4321;
		int b = -1321;
		Calculator cal = new Calculator();

		int actual = cal.add(a, b);

		int expected = 3000;
		assertEquals(expected, actual);
	}

	public void testSubtract() {
		int a = 4321;
		int b = 1321;
		Calculator cal = new Calculator();

		int actual = cal.subtract(a, b);

		int expected = 3000;
		assertEquals(expected, actual);
	}

	public void testSubtractNegative() {
		int a = 4321;
		int b = 1321;
		Calculator cal = new Calculator();

		int actual = cal.subtract(a, b);

		int expected = 3000;
		assertEquals(expected, actual);
	}

	public void testMultiply() {
		int a = 10;
		int b = 20;
		Calculator cal = new Calculator();

		int actual = cal.multiply(a, b);

		int expected = 200;
		assertEquals(expected, actual);
	}

	public void testMultiplyNegative() {
		int a = 10;
		int b = -30;
		Calculator cal = new Calculator();

		int actual = cal.multiply(a, b);

		int expected = -300;
		assertEquals(expected, actual);
	}

	public void testDivide() {
		int a = 4;
		int b = 2;
		Calculator cal = new Calculator();

		int actual = cal.divide(a, b);

		int expected = 2;
		assertEquals(expected, actual);
	}

	public void testDivideZeroError() {
		int a = 4;
		int b = 0;
		Calculator cal = new Calculator();

		try {
			cal.divide(a, b);
			fail("Expected IllegalArgumentException was not thrown");
		}

		catch (IllegalArgumentException e) {

		}
	}

	public void testDivideNegative() {
		int a = 4;
		int b = -2;
		Calculator cal = new Calculator();

		int actual = cal.divide(a, b);

		int expected = -2;
		assertEquals(expected, actual);
	}

}
