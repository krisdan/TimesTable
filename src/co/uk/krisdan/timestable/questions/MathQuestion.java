package co.uk.krisdan.timestable.questions;

import co.uk.krisdan.timestable.calc.Calculations;

public abstract class MathQuestion implements Question
{

	public int addition(int leftOperand, int rightOperand) {

		return Calculations.addition(leftOperand, rightOperand);
	}

	public int subtraction(int leftOperand, int rightOperand) {

		return Calculations.subtraction(leftOperand, rightOperand);
	}

	public int multiplication(int leftOperand, int rightOperand) {

		return Calculations.multiplication(leftOperand, rightOperand);
	}

	public int division(int leftOperand, int rightOperand) {

		return Calculations.division(leftOperand, rightOperand);
	}

	public boolean greaterThan(int leftOperand, int rightOperand) {

		return Calculations.greaterThan(leftOperand, rightOperand);
	}

	public boolean lesserThan(int leftOperand, int rightOperand) {

		return Calculations.lesserThan(leftOperand, rightOperand);
	}

	public boolean equalToOrGreaterThan(int leftOperand, int rightOperand) {

		return Calculations.equalToOrGreaterThan(leftOperand, rightOperand);
	}

	public boolean equalToOrLesserThan(int leftOperand, int rightOperand) {

		return Calculations.equalToOrLesserThan(leftOperand, rightOperand);
	}

	public boolean isEqualTo(int leftOperand, int rightOperand) {

		return Calculations.isEqualTo(leftOperand, rightOperand);
	}
}
