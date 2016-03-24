package co.uk.krisdan.timestable;


import java.util.Set;

import co.uk.krisdan.timestable.questions.*;

import java.util.*;

public interface TimesTableAPI
{
	public TimesTable getTimesTable(int numQuestions, int multiplier);

	public int[] getMultipliers(ArrayList<TimesTable> matrix);
	
	int getMultiplier(TimesTable t);

    int getNumQuestions(TimesTable t);

    Set<SimpleMathQuestion> getQuestions(TimesTable t);

    int[] getMultiples(TimesTable t);
    
    int[] getAnswers(TimesTable t);
	
	ArrayList getTimesTableMatrix(int numQuestions, int startMultiplier, int endMultiplier);
}
