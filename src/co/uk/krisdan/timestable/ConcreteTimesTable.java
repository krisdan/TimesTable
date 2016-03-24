package co.uk.krisdan.timestable;

import java.util.*;

import co.uk.krisdan.timestable.exceptions.MathOperatorException;
import co.uk.krisdan.timestable.questions.SimpleMathQuestion;

/**
 * Created by Daniel on 11/02/2016.
 */
public class ConcreteTimesTable implements TimesTable
{

    int multiplier;

    int numQuestions;

    Set<SimpleMathQuestion> questions;

    /**
     * @param multiplier
     * @param numQuestions
     */
    public ConcreteTimesTable(int numQuestions, int multiplier) {

        this.setMultiplier(multiplier);

        this.setNumQuestions(numQuestions);

        try {

            Set<SimpleMathQuestion> questions = this.generateQuestions();

            this.setQuestions(questions);

        } catch (MathOperatorException e) {

            e.getMessage();
            //exit;
        }

    }

    /**
     * ------- HELPER METHODS -------
     *
     */

    @Override
    public int getMultiplier() {
        return multiplier;
    }

    private void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }

    @Override
    public int getNumQuestions() {
        return numQuestions;
    }

    private void setNumQuestions(int numQuestions) {
        this.numQuestions = numQuestions;
    }

    @Override
    public Set<SimpleMathQuestion> getQuestionsSet() {
        return questions;
    }

    private void setQuestions(Set<SimpleMathQuestion> questions) {
        this.questions = questions;
    }

    /**
     * ------- PROTOCOL METHODS -------
     *
     */


    @Override
    public Set<SimpleMathQuestion> generateQuestions() throws MathOperatorException {

        int numQs = this.getNumQuestions();
        int multiplier = this.getMultiplier();

        Set<SimpleMathQuestion> questions = ConcreteTimesTable.generateQuestions(numQs, multiplier);

        return questions;
    }
	
	@Override
	public List<SimpleMathQuestion> getQuestionsList()
	{
		ArrayList<SimpleMathQuestion> qs = new ArrayList<SimpleMathQuestion>(this.questions);
		
		Collections.sort(qs);
		
		return qs;
	}
	
	@Override
	public String getQuestionsString() {
		
		List<SimpleMathQuestion> qList = this.getQuestionsList();
		
		StringBuilder qSring = new StringBuilder();
		
		int count = 1;
		
		for(SimpleMathQuestion question : qList) {
			
			qSring.append("\t\t\t" + question.toString());
			
			if (count < qList.size()) {
				qSring.append("\n");
			}
			
			count++;
		}
		return qSring.toString();
	}

    public static final Set<SimpleMathQuestion> generateQuestions(int numQs, int multiplier) throws MathOperatorException {

        HashSet<SimpleMathQuestion> questions = new HashSet<SimpleMathQuestion>();

        for (int i = 1; i <= numQs; i++) {

            questions.add(new SimpleMathQuestion(i, "*", multiplier));
        }
        
        return questions;
    }

    /** getMultiples()
     *
     * Returns an array of integers that represent each of
     * the multples by which the multiplier for this
     * times table will be multiplied.
     *
     * @return int[]
     */
    @Override
    public int[] getMultiplesArray() {

        Set<SimpleMathQuestion> questions = this.getQuestionsSet();

        int[] multiples = new int[questions.size()];

        int i = 0;

        for (SimpleMathQuestion q : questions) {

            multiples[i] = q.getLeftOperand();

            i++;
        }
		
		Arrays.sort(multiples);
		
        return multiples;
    }

	@Override
	public String getMultiplesString() {
		
		int[] mtpls = this.getMultiplesArray();

		StringBuilder multiples = new StringBuilder();

		int count = 1;

		for(int m : mtpls) {

			multiples.append(m);

			if (count  < mtpls.length) {
				multiples.append(", ");
			}
			count++;
		}
		
		return multiples.toString();
	}
	
	@Override
	public int[] getAnswers() {
		
		List<SimpleMathQuestion> questions = this.getQuestionsList();
		
		int[] answers = new int[questions.size()];
		
		int i = 0;
		
		for(SimpleMathQuestion s: questions) {
			
			answers[i] = s.getAnswerInt();
			
			i++;
		}
		
		return answers;
	}


	@Override
	public String toString() {
		
		StringBuilder tableString = new StringBuilder();
		
		tableString.append("\n");
		tableString.append("(-----------------------------------------) \n\n");
		tableString.append(this.getMultiplier());
		tableString.append(" Times Table");
		tableString.append("\n\n");
		tableString.append("Number of Questions: ");
		tableString.append(this.getNumQuestions());
		tableString.append("\n\n");
		tableString.append("List of Multiples: ");
		tableString.append(this.getMultiplesString());
		tableString.append("\n\n");
		tableString.append("List of Questions: \n");
		tableString.append(this.getQuestionsString());
		tableString.append("\n");
		tableString.append("(-----------------------------------------) \n");
		
		return tableString.toString();
	}

}
