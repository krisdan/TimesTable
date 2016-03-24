package co.uk.krisdan.timestable;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import co.uk.krisdan.timestable.ConcreteTimesTable;
import co.uk.krisdan.timestable.TimesTable;
import co.uk.krisdan.timestable.exceptions.MathOperatorException;
import co.uk.krisdan.timestable.questions.SimpleMathQuestion;

public class ConcreteTimesTableTests {

	@Test
	public void testConcreteTimesTable() {
		
		boolean initialisedCorrectly = true;
		
		int numQs = 4;
		
		int multiplier = 2;
		
		TimesTable t = new ConcreteTimesTable(numQs, multiplier);
		
		boolean isTimesTable = false;
		
		boolean isConcrete = false;
		
		boolean correctNumQs = false;
		
		boolean correctMultiplier = false;
		
		if (t instanceof TimesTable) {
			
			isTimesTable = true;
		}
		
		if (t instanceof ConcreteTimesTable) {
			
			isConcrete = true;
		}
		
		if (t.getNumQuestions() == numQs) {
			correctNumQs = true;
		}
		
		if (t.getMultiplier() == multiplier) {
			correctMultiplier = true;
		}
		
		initialisedCorrectly = (isTimesTable && isConcrete && correctNumQs && correctMultiplier);
		
		assertEquals(initialisedCorrectly, true);
	}

	@Test
	public void testGetMultiplier() {
		
		boolean isCorrect = false;
		
		int numQs = 4;
		
		int multiplier = 2;
		
		TimesTable t = new ConcreteTimesTable(numQs, multiplier);
		
		isCorrect = (multiplier == t.getMultiplier());
		
		assertEquals(true, isCorrect);
	}

	@Test
	public void testGetNumQuestions() {
		
		boolean isCorrect = false;
		
		int numQs = 4;
		
		int multiplier = 2;
		
		TimesTable t = new ConcreteTimesTable(numQs, multiplier);
		
		isCorrect = (numQs == t.getNumQuestions());
		
		assertEquals(true, isCorrect);
	}

	@Test
	public void testGetQuestionsSet() {
		
		boolean isCorrect = false;
		
		int numQs = 4;
		
		int multiplier = 2;
		
		TimesTable t = new ConcreteTimesTable(numQs, multiplier);
		
		Set<SimpleMathQuestion> qsSet = t.getQuestionsSet();
		
		isCorrect = (numQs == qsSet.size());
		
		assertEquals(true, isCorrect);
	}

	@Test
	public void testGenerateQuestions() throws MathOperatorException {
		
		boolean isCorrect = false;
		
		int numQs = 4;
		
		int multiplier = 2;
		
		TimesTable t = new ConcreteTimesTable(numQs, multiplier);
		
		Set<SimpleMathQuestion> qsSet = t.generateQuestions();
		
		isCorrect = (numQs == qsSet.size());
		
		assertEquals(true, isCorrect);
	}

	@Test
	public void testGetQuestionsList() {
		
		boolean isCorrect = false;
		
		int numQs = 4;
		
		int multiplier = 2;
		
		TimesTable t = new ConcreteTimesTable(numQs, multiplier);
		
		List<SimpleMathQuestion> qsSet = t.getQuestionsList();
		
		isCorrect = (numQs == qsSet.size());
		
		assertEquals(true, isCorrect);
	}

	@Test
	public void testGetQuestionsString() {
		
		boolean isCorrect = false;
		
		int numQs = 4;
		
		int multiplier = 2;
		
		TimesTable t = new ConcreteTimesTable(numQs, multiplier);
		
		String questions = t.getQuestionsString();
		
		isCorrect = (questions instanceof String);
		
		assertEquals(true, isCorrect);
	}

	@Test
	public void testGenerateQuestionsIntInt() throws MathOperatorException {
		
		boolean isCorrect = false;
		
		int numQs = 4;
		
		int multiplier = 2;
		
		Set<SimpleMathQuestion> questions = ConcreteTimesTable.generateQuestions(numQs, multiplier);
		
		isCorrect = (numQs == questions.size());
		
		assertEquals(true, isCorrect);
	}

	@Test
	public void testGetMultiplesArray() {
		
		boolean isCorrect = false;
		
		int numQs = 4;
		
		int multiplier = 2;
		
		TimesTable t = new ConcreteTimesTable(numQs, multiplier);
		
		int[] multiples = t.getMultiplesArray();
		
		isCorrect = (numQs == multiples.length);
		
		assertEquals(true, isCorrect);
	}

	@Test
	public void testGetMultiplesString() {
		
		boolean isCorrect = false;
		
		int numQs = 4;
		
		int multiplier = 2;
		
		TimesTable t = new ConcreteTimesTable(numQs, multiplier);
		
		String multiples = t.getMultiplesString();
		
		isCorrect = (multiples instanceof String);
		
		assertEquals(true, isCorrect);
	}

	@Test
	public void testToString() {
		
		boolean isCorrect = false;
		
		int numQs = 4;
		
		int multiplier = 2;
		
		TimesTable t = new ConcreteTimesTable(numQs, multiplier);
		
		String stringTimesTable = t.toString();
		
		isCorrect = (stringTimesTable instanceof String);
		
		assertEquals(true, isCorrect);
	}

}
