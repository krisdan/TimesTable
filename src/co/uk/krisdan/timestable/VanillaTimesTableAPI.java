package co.uk.krisdan.timestable;

import java.util.*;

import co.uk.krisdan.timestable.questions.*;

public class VanillaTimesTableAPI implements TimesTableAPI
{
	
	private static TimesTableAPI instance = null;
	
	protected VanillaTimesTableAPI( ) {
		
	}
	
	public static TimesTableAPI getInstance( ) {
		
		if (instance == null) {
			instance = new VanillaTimesTableAPI();
		}
		return instance;
	}
	
	private ArrayList<TimesTable> generateMatrix(int numQuestions, int startMultiplier, int endMultiplier) {
		
		ArrayList<TimesTable> timesTables = new ArrayList<TimesTable>();
		
		int i;
		
		for(i = startMultiplier; i <= endMultiplier; i++) {
			
			timesTables.add(new ConcreteTimesTable(numQuestions, i));
		}
		return timesTables;
	}

	@Override
	public TimesTable getTimesTable(int numQuestions, int multiplier)
	{
		TimesTable t = new ConcreteTimesTable(numQuestions, multiplier);
		
		return t;
	}

	@Override
	public int[] getMultipliers(ArrayList<TimesTable> matrix)
	{
		int[] multipliers = new int[matrix.size()];
		
		int i = 0;
		
		for(TimesTable t : matrix) {
			
			multipliers[i] = t.getMultiplier();
			
			i++;
		}
		
		return multipliers;
	}

	@Override
	public int getMultiplier(TimesTable t)
	{
		return t.getMultiplier();
	}

	@Override
	public int getNumQuestions(TimesTable t)
	{
		return t.getNumQuestions();
	}

	@Override
	public Set<SimpleMathQuestion> getQuestions(TimesTable t)
	{
		return t.getQuestionsSet();
	}

	@Override
	public int[] getMultiples(TimesTable t)
	{
		return t.getMultiplesArray();
	}
	
	@Override
	public int[] getAnswers(TimesTable t) {
		
		return t.getAnswers();
	}

	@Override
	public ArrayList<TimesTable> getTimesTableMatrix(int numQuestions, int startMultiplier, int endMultiplier)
	{
		return this.generateMatrix(numQuestions, startMultiplier, endMultiplier);
	}
}
