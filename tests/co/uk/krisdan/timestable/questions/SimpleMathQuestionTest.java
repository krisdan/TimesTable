package co.uk.krisdan.timestable.questions;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

import co.uk.krisdan.timestable.exceptions.MathOperatorException;
import co.uk.krisdan.timestable.questions.SimpleMathQuestion;


public class SimpleMathQuestionTest {
	
	@Test
	public void testAddition() throws MathOperatorException {
		
		int leftOperand = 2;
		int rightOperand = 2;
		
		SimpleMathQuestion mathQ = new SimpleMathQuestion(2, "+", 2);
		
		boolean ans = (mathQ.addition(leftOperand, rightOperand) == 4); 
		
		assertEquals(ans, true);
	}
	
	@Test
	public void testSubtraction() throws MathOperatorException {
		
		int leftOperand = 4;
		int rightOperand = 2;
		
		SimpleMathQuestion mathQ = new SimpleMathQuestion(4, "+", 2);
		
		boolean ans = (mathQ.subtraction(leftOperand, rightOperand) == 2); 
		
		assertEquals(ans, true);
	}
	
	@Test
	public void testMultiplacation() throws MathOperatorException {
		int leftOperand = 2;
		int rightOperand = 2;
		
		SimpleMathQuestion mathQ = new SimpleMathQuestion(2, "+", 2);
		
		boolean ans = (mathQ.multiplication(leftOperand, rightOperand) == 4 ); 
		
		assertEquals(ans, true);
	}
	
	@Test
	public void testDivision() throws MathOperatorException {
		int leftOperand = 4;
		int rightOperand = 2;
		
		SimpleMathQuestion mathQ = new SimpleMathQuestion(2, "+", 2);
		
		boolean ans = (mathQ.division(leftOperand, rightOperand) == 2 ); 
		
		assertEquals(ans, true);
	}
	
	@Test
	public void testGreaterThan() throws MathOperatorException {
		int leftOperand = 4;
		int rightOperand = 2;
		
		SimpleMathQuestion mathQ = new SimpleMathQuestion(4, "+", 2);
		
		boolean ans = (mathQ.greaterThan(leftOperand, rightOperand)); 
		
		assertEquals(ans, true);
	}
	
	@Test
	public void testLesserThan() throws MathOperatorException {
		int leftOperand = 2;
		int rightOperand = 4;
		
		SimpleMathQuestion mathQ = new SimpleMathQuestion(2, "+", 4);
		
		boolean ans = (mathQ.lesserThan(leftOperand, rightOperand)); 
		
		assertEquals(ans, true);
	}
	
	@Test
	public void testEqualToOrGreaterThanEqual() throws MathOperatorException {
		int leftOperand = 2;
		int rightOperand = 2;
		
		SimpleMathQuestion mathQ = new SimpleMathQuestion(2, "+", 2);
		
		boolean ans = (mathQ.equalToOrGreaterThan(leftOperand, rightOperand)); 
		
		assertEquals(ans, true);
	}
	
	public void testEqualToOrGreaterThanGreater() throws MathOperatorException {
		int leftOperand = 4;
		int rightOperand = 2;
		
		SimpleMathQuestion mathQ = new SimpleMathQuestion(4, "+", 2);
		
		boolean ans = (mathQ.equalToOrGreaterThan(leftOperand, rightOperand)); 
		
		assertEquals(ans, true);
	}
	
	@Test
	public void testEqualToOrLesserThanEqual() throws MathOperatorException {
		
		int leftOperand = 2;
		int rightOperand = 2;
		
		SimpleMathQuestion mathQ = new SimpleMathQuestion(2, "+", 2);
		
		boolean ans = (mathQ.equalToOrLesserThan(leftOperand, rightOperand)); 
		
		assertEquals(ans, true);
	}
	@Test
	public void testEqualToOrLesserThanLesser() throws MathOperatorException {
		
		int leftOperand = 2;
		int rightOperand = 4;
		
		SimpleMathQuestion mathQ = new SimpleMathQuestion(2, "+", 4);
		
		boolean ans = (mathQ.equalToOrLesserThan(leftOperand, rightOperand)); 
		
		assertEquals(ans, true);
	}
	
	@Test
	public void testIsEqualTo() throws MathOperatorException {
		
		int leftOperand = 2;
		int rightOperand = 2;
		
		SimpleMathQuestion mathQ = new SimpleMathQuestion(2, "+", 2);
		
		boolean ans = (mathQ.isEqualTo(leftOperand, rightOperand)); 
		
		assertEquals(ans, true);
	}

	@Test
	public void testSimpleMathQuestion() throws MathOperatorException {
		
		SimpleMathQuestion mathQ = new SimpleMathQuestion(2, "+", 2);
		
		boolean ans = (mathQ.rightOperand == 2 || mathQ.operator == "+" || mathQ.leftOperand == 2 ); 
		
		assertEquals(ans, true);
	}
	
	@Test
	public void testSetLeftOperand() throws MathOperatorException {
		
		int leftOperand = 2;

		SimpleMathQuestion mathQ = new SimpleMathQuestion(leftOperand, "+", 0);

		Class[] methodParameters = new Class[] { int.class };

		Object[] params = new Object[] { new Integer(leftOperand) };

		Method privateMethod;

		try {
			privateMethod = SimpleMathQuestion.class.getDeclaredMethod(
					"setLeftOperand", methodParameters);

			privateMethod.setAccessible(true);

			boolean privateReturnValue = (boolean) privateMethod.invoke(
					mathQ, params);

			assertEquals(true, privateReturnValue);

		} catch (NoSuchMethodException | SecurityException e) {

			e.printStackTrace();
		} catch (IllegalAccessException e) {

			e.printStackTrace();
		} catch (IllegalArgumentException e) {

			e.printStackTrace();
		} catch (InvocationTargetException e) {

			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testGetLeftOperand() throws MathOperatorException {
		
        SimpleMathQuestion mathQ = new SimpleMathQuestion(2, "+", 2);
		
		boolean ans = mathQ.getLeftOperand() == 2; 
		
		assertEquals(ans, true);
		
	}
	
	@Test
	public void testSetRightOperand() throws MathOperatorException {
		
		int rightOperand = 2;

		SimpleMathQuestion mathQ = new SimpleMathQuestion(0, "+", rightOperand);

		Class[] methodParameters = new Class[] { int.class };

		Object[] params = new Object[] { new Integer(rightOperand) };

		Method privateMethod;

		try {
			privateMethod = SimpleMathQuestion.class.getDeclaredMethod(
					"setRightOperand", methodParameters);

			privateMethod.setAccessible(true);

			boolean privateReturnValue = (boolean) privateMethod.invoke(
					mathQ, params);

			assertEquals(true, privateReturnValue);

		} catch (NoSuchMethodException | SecurityException e) {

			e.printStackTrace();
		} catch (IllegalAccessException e) {

			e.printStackTrace();
		} catch (IllegalArgumentException e) {

			e.printStackTrace();
		} catch (InvocationTargetException e) {

			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetRightOperand() throws MathOperatorException {
		
	        SimpleMathQuestion mathQ = new SimpleMathQuestion(2, "+", 2);
		
			boolean ans = mathQ.getRightOperand() == 2; 
			
			assertEquals(ans, true);
		
	}
	
	@Test
	public void testSetOperator() throws MathOperatorException {
		
		String operator = "+";

		SimpleMathQuestion mathQ = new SimpleMathQuestion(0, operator, 0);

		Class[] methodParameters = new Class[] { String.class };

		Object[] params = new Object[] { new String(operator) };

		Method privateMethod;

		try {
			privateMethod = SimpleMathQuestion.class.getDeclaredMethod(
					"setOperator", methodParameters);

			privateMethod.setAccessible(true);

			boolean privateReturnValue = (boolean) privateMethod.invoke(
					mathQ, params);

			assertEquals(true, privateReturnValue);

		} catch (NoSuchMethodException | SecurityException e) {

			e.printStackTrace();
		} catch (IllegalAccessException e) {

			e.printStackTrace();
		} catch (IllegalArgumentException e) {

			e.printStackTrace();
		} catch (InvocationTargetException e) {

			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testGetOperator() throws MathOperatorException {
		
	        SimpleMathQuestion mathQ = new SimpleMathQuestion(2, "+", 2);
		
			boolean ans = mathQ.getOperator() == "+"; 
			
			assertEquals(ans, true);
		
	}
	
	@Test
	public void testSetAnswer() throws MathOperatorException {
		
		int leftOperand = 2;
		int rightOperand = 2;
		String operator = "+";

		SimpleMathQuestion mathQ = new SimpleMathQuestion(leftOperand, operator, rightOperand);

		Class[] methodParameters = new Class[] { int.class, String.class, int.class };

		Object[] params = new Object[] { new Integer(leftOperand), new String(operator), new Integer(rightOperand)};

		Method privateMethod;

		try {
			privateMethod = SimpleMathQuestion.class.getDeclaredMethod(
					"setanswer", methodParameters);

			privateMethod.setAccessible(true);

			boolean privateReturnValue = (boolean) privateMethod.invoke(
					mathQ, params);

			assertEquals(true, privateReturnValue);

		} catch (NoSuchMethodException | SecurityException e) {

			e.printStackTrace();
		} catch (IllegalAccessException e) {

			e.printStackTrace();
		} catch (IllegalArgumentException e) {

			e.printStackTrace();
		} catch (InvocationTargetException e) {

			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testGetAnswer() throws MathOperatorException {
		
	        SimpleMathQuestion mathQ = new SimpleMathQuestion(2, "+", 2);
		
	        int result = (int) mathQ.getAnswer();
	        
			boolean ans = (result == 4); 
			
			assertEquals(ans, true);
		
	}
	
	@Test
	public void testAnswer() throws MathOperatorException {
		
	       SimpleMathQuestion mathQ = new SimpleMathQuestion(2, "+", 2);
		
	       int result = (int) mathQ.answer;
	        
			boolean ans = (result == 4);
			
			assertEquals(ans, true);
		
	}

	@Test
	public void testCompareToGreater() throws MathOperatorException {
		
		
		SimpleMathQuestion mathQ = new SimpleMathQuestion(4, "+", 2);
		SimpleMathQuestion mathQ2 = new SimpleMathQuestion(2, "+", 2);
		
		boolean ans = mathQ.compareTo(mathQ2) == 1;
		
		assertEquals(ans, true);
		
	}
	
	@Test
	public void testCompareToEqual() throws MathOperatorException {
		
		
		SimpleMathQuestion mathQ = new SimpleMathQuestion(2, "+", 2);
		SimpleMathQuestion mathQ2 = new SimpleMathQuestion(2, "+", 2);
		
		boolean ans = mathQ.compareTo(mathQ2) == 0;
		
		assertEquals(ans, true);
		
	}
	
	@Test
	public void testCompareToLesser() throws MathOperatorException {
		
		
		SimpleMathQuestion mathQ = new SimpleMathQuestion(2, "+", 2);
		SimpleMathQuestion mathQ2 = new SimpleMathQuestion(4, "+", 2);
		
		boolean ans = mathQ.compareTo(mathQ2) == -1;
		
		assertEquals(ans, true);
		
	}
	
	@Test
	public void testValidate() throws MathOperatorException {
		int leftOperand = 2;
		int rightOperand = 2;
		String operator = "+";
		
		SimpleMathQuestion mathQ = new SimpleMathQuestion(2, "+", 2);
		
		 boolean ans = mathQ.validate(leftOperand, operator, rightOperand);
	        
			
		assertEquals(ans, true);
	}

	@Test
	public void testToString() throws MathOperatorException {
		

        SimpleMathQuestion mathQ = new SimpleMathQuestion(2, "+", 2);
	
		boolean ans = mathQ.toString().contains("2 + 2 = 4");
		
		assertEquals(ans, true);
		
	}

}
