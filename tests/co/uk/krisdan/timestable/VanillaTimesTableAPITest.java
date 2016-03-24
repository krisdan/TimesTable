package co.uk.krisdan.timestable;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Set;

import org.junit.Test;

import co.uk.krisdan.timestable.ConcreteTimesTable;
import co.uk.krisdan.timestable.TimesTable;
import co.uk.krisdan.timestable.TimesTableAPI;
import co.uk.krisdan.timestable.VanillaTimesTableAPI;
import co.uk.krisdan.timestable.questions.SimpleMathQuestion;

public class VanillaTimesTableAPITest {
/*
	@Test
	public void testVanillaTimesTableAPI() {
		
		
		
	}
	*/
	@Test
	public void testGetInstance() {
		
		
		VanillaTimesTableAPI api = (VanillaTimesTableAPI) VanillaTimesTableAPI.getInstance();
		
		boolean ans = (api instanceof VanillaTimesTableAPI);
		
		assertEquals(ans, true);
		
	}
	
	@Test
	public void testGetTimesTable() {
		
		boolean isTimesTable = false;
		
		int numQuestions = 4;
		int multiplier = 2;
		
        TimesTableAPI api = VanillaTimesTableAPI.getInstance();
		
        TimesTable timesTable = api.getTimesTable(numQuestions, multiplier);
        
        isTimesTable = (timesTable instanceof TimesTable) && (timesTable != null);
		
		assertEquals(isTimesTable, true);
		
	}

	@Test
	public void testGetMultipliers() {
		
		boolean isCorrect = false;
		
		int numQuestions = 10;
		int startMultiplier = 1;
		int endMultiplier = 10;
		
		ArrayList<TimesTable> timesTables = new ArrayList<TimesTable>();
		
		int i;
		
		for(i = startMultiplier; i <= endMultiplier; i++) {
			
			timesTables.add(new ConcreteTimesTable(numQuestions, i));
		}
		
		TimesTableAPI api = VanillaTimesTableAPI.getInstance();
		
		int[] multipliers = api.getMultipliers(timesTables);
		
		int length = multipliers.length;
		
		boolean startIsCorrect = (startMultiplier == multipliers[0]);

		boolean endIsCorrect = (endMultiplier == multipliers[length - 1]);

		boolean countIsCorrect = (numQuestions == length);

		isCorrect = (startIsCorrect && endIsCorrect && countIsCorrect);
		
		assertEquals(true, isCorrect);
	}

	@Test
	public void testGetMultiplier() {
		
		boolean isCorrect = false;
		
		int numQuestions = 4;
		int multiplier = 2;
		
        TimesTableAPI api = VanillaTimesTableAPI.getInstance();
		
        TimesTable timesTable = api.getTimesTable(numQuestions, multiplier);
        
        isCorrect = (multiplier == api.getMultiplier(timesTable));
		
		assertEquals(isCorrect, true);
	}

	@Test
	public void testGetNumQuestions() {
		
		boolean isCorrect = false;
		
		int numQuestions = 4;
		int multiplier = 2;
		
        TimesTableAPI api = VanillaTimesTableAPI.getInstance();
		
        TimesTable timesTable = api.getTimesTable(numQuestions, multiplier);
        
        isCorrect = (numQuestions == api.getNumQuestions(timesTable));
		
		assertEquals(isCorrect, true);
	}

	@Test
	public void testGetQuestions() {
		
		boolean isCorrect = false;
		
		int numQuestions = 4;
		int multiplier = 2;
		
        TimesTableAPI api = VanillaTimesTableAPI.getInstance();
		
        TimesTable timesTable = api.getTimesTable(numQuestions, multiplier);
        
        Set<SimpleMathQuestion> questions = api.getQuestions(timesTable);
        
        ArrayList<SimpleMathQuestion> qs = new ArrayList<SimpleMathQuestion>(questions);
        
        Set<SimpleMathQuestion> tableQuestions = timesTable.getQuestionsSet();
        
        ArrayList<SimpleMathQuestion> tableQs = new ArrayList<SimpleMathQuestion>(tableQuestions);
        
        boolean correctNumQs = (numQuestions == questions.size());
        
        boolean qsMatch = true;
        
        for(int i = 0; i < questions.size(); i++) {
        	
        	if(qs.get(i).equals(tableQs.get(i)) == false) {
        		
        		qsMatch = false;
        	}
        }
        
        isCorrect = (correctNumQs && qsMatch);
		
		assertEquals(true, isCorrect);
	}

	@Test
	public void testGetMultiples() {
		
		boolean isCorrect = false;
		
		int numQuestions = 4;
		int multiplier = 2;
		
        TimesTableAPI api = VanillaTimesTableAPI.getInstance();
		
        TimesTable timesTable = api.getTimesTable(numQuestions, multiplier);
        
        int[] multiples = api.getMultiples(timesTable);
        
        isCorrect = (numQuestions == multiples.length);
        
        assertEquals(true, isCorrect);
	}

 
 		@Test
	public void testGetAnswers() {
		
		boolean isCorrect = false;
		
		int numQuestions = 4;
		int multiplier = 2;
		
        TimesTableAPI api = VanillaTimesTableAPI.getInstance();
		
        TimesTable timesTable = api.getTimesTable(numQuestions, multiplier);
        
        int[] answers = api.getAnswers(timesTable);
        
        boolean correctNum = (numQuestions == answers.length);
        
        boolean answersCorrect = true;
        
        for(int i = 0; i < numQuestions; i++) {
        	
        	int multiple = i +1;
        	
        	if (answers[i] != (multiple * multiplier)) {
        		answersCorrect = false;
        	}
        }
        
        isCorrect = (answersCorrect && correctNum );
        
        assertEquals(true, isCorrect);
	}
	
	@Test
	public void testGetTimesTableMatrix() {
		
		boolean isCorrect = false;
		
		int numQuestions = 4;
		int startMultiplier = 2;
		int endMultiplier = 12;
		
        TimesTableAPI api = VanillaTimesTableAPI.getInstance();
		
        //TimesTable timesTable = api.getTimesTable(numQuestions, startMultiplier);
        
        ArrayList<TimesTable> matrix = api.getTimesTableMatrix(numQuestions, startMultiplier, endMultiplier);
        
        boolean correctNumTables = (matrix.size() == 11);
        
        boolean correctNumQs = true;
        
        boolean correctTables = true;
        
        int tableNum = 2;
        
        for(int i = 0; i < matrix.size(); i++) {
        	
        	TimesTable t = matrix.get(i);
        	
        	if(t.getNumQuestions() != numQuestions) {
        		correctNumQs = false;
        	}
        	
        	if(t.getMultiplier() != tableNum) {
        		correctTables = false;
        	}
        	System.out.print(t);
        	tableNum++;
        }
        
        isCorrect = (correctNumTables && correctNumQs && correctTables);
        
        assertEquals(true, isCorrect);
	}

}
