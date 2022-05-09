/**
 * 
 */
package testing;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author crice
 *
 */
class CalculatorTest {
	Calculator calc;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {

		calc = new Calculator();
	}

	/**
	 * Test method for {@link testing.Calculator#add(int, int)}.
	 */
	@Test
	@DisplayName("This is simple addition")
	void testAdd() {
		assertEquals(4, calc.add(2, 2));
	}

	/**
	 * Test method for {@link testing.Calculator#sub(int, int)}.
	 */
	@Test
	@DisplayName("This is simple subtraction")
	void testSub() {
		assertEquals(0, calc.sub(2, 2));
	}

	/**
	 * Test method for {@link testing.Calculator#div(int, int)}.
	 */
	@Test
	@DisplayName("This is simple division")
	void testDiv() {
		assertEquals(1, calc.div(2, 2));

	}

	@Test
	void testForDivZero() {
		Exception exception = assertThrows(ArithmeticException.class, () -> calc.div(0, 2));
	}

	/**
	 * Test method for {@link testing.Calculator#mult(int, int)}.
	 */
	@Test
	@DisplayName("This is simple multiplication")
	void testMult() {
		assertEquals(4, calc.mult(2, 2));
		assertEquals(0, calc.mult(0, 2));
	}

}
