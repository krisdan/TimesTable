package co.uk.krisdan.timestable.questions;

import java.util.ArrayList;
import java.util.List;

import co.uk.krisdan.timestable.calc.Calculations;
import co.uk.krisdan.timestable.exceptions.MathOperatorException;

public class SimpleMathQuestion extends MathQuestion implements Comparable
{

	int leftOperand = 0;

	int rightOperand = 0;

	String operator = null;

	Object answer = null;

	public SimpleMathQuestion(int leftOperand, String operator, int rightOperand) throws MathOperatorException {

		this.setLeftOperand(leftOperand);

		if(!this.setOperator(operator)) { throw new MathOperatorException(); }

		this.setRightOperand(rightOperand);

        this.setAnswer(leftOperand, operator, rightOperand);
	}

	public boolean setLeftOperand(int leftOperand)
	{
		boolean success = false;

		this.leftOperand = leftOperand;

		int setVal = this.getLeftOperand();

		if(leftOperand == setVal) { success = true;}

		return success;
	}

	public int getLeftOperand()
	{
		return leftOperand;
	}

	public boolean setRightOperand(int rightOperand)
	{
		boolean success = false;

		this.rightOperand = rightOperand;

		int setVal = this.getRightOperand();

		if (rightOperand == setVal) {success = true;}

		return success;
	}

	public int getRightOperand()
	{
		return rightOperand;
	}

	public boolean setOperator(String operator)
	{
        boolean success = false;

		boolean valid = this.validateOperator(operator);

		if (valid) {

			this.operator = operator;
		}

        String setVal = this.getOperator();

		success = (setVal == operator);

        return success;
	}

	public String getOperator()
	{
		return operator;
	}

	public boolean setAnswer(int leftOperand, String operator, int rightOperand)
	{
		boolean success = false;

		this.answer = this.calculate(leftOperand, operator, rightOperand);

		if (this.getAnswer() != null) {success = true;}

		return success;
	}

	protected Object getAnswer()
	{
		return answer;
	}
	
	public int getAnswerInt()
	{
		return (int) answer;
	}

	@Override
	public Object answer( )
	{
        Object answer = null;

        answer = this.getAnswer();

        return answer;
    }

	private Object calculate(int left, String operator, int right)
	{
		Object answer;

		switch (operator) {

			case "+":  answer = new Integer(this.addition(left, right));
				break;

		    case "-":  answer = new Integer(this.subtraction(left, right));
				break;

			case "*":  answer = new Integer(this.multiplication(left, right));
				break;

			case "/":  answer = new Integer(this.division(left, right));
				break;

			case ">":  	answer = new Boolean(this.greaterThan(left, right));
				break;

			case "<": 	answer = new Boolean(this.lesserThan(left, right));
				break;

			case ">=": 	answer = new Boolean(this.equalToOrGreaterThan(left, right));
				break;

			case "<=":  answer = new Boolean(this.equalToOrLesserThan(left, right));
				break;

			case "==":  answer = new Boolean(this.isEqualTo(left, right));
				break;

			default : answer = null;
		}

		return answer;
	}
	
	@Override
	public int compareTo(Object p1)
	{
		SimpleMathQuestion q = (SimpleMathQuestion) p1;
		
		int isEqual = -1;
		
		if (this.getLeftOperand() > q.getLeftOperand()) {
			isEqual = 1;
		}
		
		if (this.getLeftOperand() < q.getLeftOperand()) {
			isEqual = -1;
		}
		
		if (this.getLeftOperand() == q.getLeftOperand()) {
			isEqual = 0;
		}
		
		return isEqual;
	}

	private boolean validateOperator(String operator) {

		boolean valid = false;

		List<String> operators = new ArrayList();

		operators.add("=");

		operators.add("+");

		operators.add("-");

		operators.add("*");

		operators.add("/");

		operators.add(">");

		operators.add("<");

		operators.add(">=");

		operators.add("<=");

		operators.add("==");

		valid = (operators.contains(operator));

		return valid;
	}

	public boolean validate(int leftOperand, String operator, int rightOperand)
	{
		boolean isValid = false;

		boolean leftValid = (leftOperand == this.getLeftOperand());

		boolean operatorValid = (operator == this.getOperator());

		boolean rightOperandValid = (rightOperand == this.getRightOperand());

		isValid = (leftValid && operatorValid && rightOperandValid);

		return isValid;
	}

	@Override
	public String toString()
	{
		StringBuilder question = new StringBuilder();
		
		question.append(this.getLeftOperand());
		question.append(" ");
		question.append(this.getOperator());
		question.append(" ");
		question.append(this.getRightOperand());
		question.append(" = ");
		question.append(this.getAnswer());
		
		return question.toString();
	}

}
