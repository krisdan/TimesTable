package co.uk.krisdan.timestable;


import java.util.Set;

import co.uk.krisdan.timestable.exceptions.MathOperatorException;
import co.uk.krisdan.timestable.questions.SimpleMathQuestion;

import java.util.*;

/**
 * Created by Chris on 17/02/2016.
 */
public interface TimesTable {

    int getMultiplier();

    int getNumQuestions();
    
    int[] getAnswers();

    Set<SimpleMathQuestion> getQuestionsSet();
	
	List<SimpleMathQuestion> getQuestionsList();
	
	String getQuestionsString();

	Set<SimpleMathQuestion> generateQuestions() throws MathOperatorException;

    int[] getMultiplesArray();
	
	String getMultiplesString();
	
}
