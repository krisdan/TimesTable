package co.uk.krisdan.timestable.calc;

import static org.junit.Assert.*;

import org.junit.Test;

import co.uk.krisdan.timestable.calc.Calculations;

public class CalculationsTest {

	@Test
	public void testAddition() {
		
		int leftOperand = 5;
		int rightOperand = 5;
		
		int calc = Calculations.addition(leftOperand, rightOperand);
		
		boolean result = (calc == 10);
		
		assertEquals(result, true);
		
	}


	@Test
	public void testSubtraction() {
		int leftOperand = 10;
		int rightOperand = 5;
		
		int calc = Calculations.subtraction(leftOperand, rightOperand);
		
		boolean result = (calc == 5);
		
		assertEquals(result, true);
		
	}


	@Test
	public void testMultiplication() {
		
		int leftOperand = 5;
		int rightOperand = 5;
		
		int calc = Calculations.multiplication(leftOperand, rightOperand);
		
		boolean result = calc == 25;
		
		assertEquals(result, true);
	
	}

	@Test
	public void testDivision() {
		
		int leftOperand = 10;
		int rightOperand = 5;
		
		int calc = Calculations.division(leftOperand, rightOperand);
		
		boolean result = calc == 2;
		
		assertEquals(result, true);
		
	}

	@Test
	public void testGreaterThan() {
		
		int leftOperand = 10;
		int rightOperand = 5;
		
		boolean result = Calculations.greaterThan(leftOperand, rightOperand);
		
		assertEquals(result, true);
		
	}

	@Test
	public void testLesserThan() {
		
		int leftOperand = 5;
		int rightOperand = 10;
		
		boolean result = Calculations.lesserThan(leftOperand, rightOperand);
		
		assertEquals(result, true);
		
	}

	@Test
	public void testEqualToOrGreaterThanEqual() {
		
		int leftOperand = 10;
		int rightOperand = 10;
		
		boolean result = Calculations.equalToOrGreaterThan(leftOperand, rightOperand);
		
		assertEquals(result, true);
		
	}
	

	@Test
	public void testEqualToOrGreaterThanGreater() {
		
		int leftOperand = 20;
		int rightOperand = 10;
		
		boolean result = Calculations.equalToOrGreaterThan(leftOperand, rightOperand);
		
		assertEquals(result, true);
		
	}

	@Test
	public void testEqualToOrLesserThanEqual() {
		
		int leftOperand = 10;
		int rightOperand = 10;
		
		boolean result = Calculations.equalToOrLesserThan(leftOperand, rightOperand);
		
		assertEquals(result, true);
		
	}
	
	@Test
	public void testEqualToOrLesserThanLesser() {
		
		int leftOperand = 2;
		int rightOperand = 10;
		
		boolean result = Calculations.equalToOrLesserThan(leftOperand, rightOperand);
		
		assertEquals(result, true);
		
	}
	

	@Test
	public void testIsEqualTo() {
		
		int leftOperand = 10;
		int rightOperand = 10;
		
		boolean result = Calculations.isEqualTo(leftOperand, rightOperand);
		
		assertEquals(result, true);
		
	}


}
