package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import exec.Calculator;

public class CalculatorTest {

	@Test
	void testAdd() {
		assertEquals(5.0, Calculator.add(2, 3));
	}

	@Test
	void testSubtract() {
		assertEquals(1.0, Calculator.subtract(4, 3));
	}

	@Test
	void testMultiply() {
		assertEquals(12.0, Calculator.multiply(4, 3));
	}

	@Test
	void testDivide() {
		assertEquals(2.0, Calculator.divide(6, 3));
	}

	@Test
	void testDivideByZeroThrowsException() {
		assertThrows(ArithmeticException.class, () -> {
			Calculator.divide(10, 0);
		});
	}
}
