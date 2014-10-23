//Kelly Nguyen
//CS356-01 Object-Oriented Programming  
//MWF 10:30AM - 11:35AM
//Project #1: iClicker Simulator

import java.util.Hashtable;

public class IClickerService {
	
	private Question question;
	private int[] count;
	private Hashtable<String, String> roster;
	
	public IClickerService(Question question) {
		this.question = question;
		count  = new int[question.getOptions().length];
		
		//Create the Hash Table to handle the submissions.
	    roster = new Hashtable<String, String>();
	}
	
	public void submitAnswer(Student student) {
		//If the Student already exists in the Roster, remove their previous answer from the total Count.
	    if (roster.containsKey(student.getID())) {
	    	String oldAnswer = roster.get(student.getID());
	    	
	    	for (int i = 0; i < oldAnswer.length(); i++) {
				int temp = Character.getNumericValue(oldAnswer.charAt(i));
				count[temp] = count[temp] - 1;
			}
	    }

	    //Register their new answer to the Count.
	    String answer = student.getAnswer();
		for (int i = 0; i < answer.length(); i++) {
			int temp = Character.getNumericValue(answer.charAt(i));
			count[temp] = count[temp] + 1;
		}
		
		//Update the Roster (Hash Table) with Students and their answers.
	    this.roster.put(student.getID(), answer);
	}
	
	public int[] getCount() {
		return count;
	}

	public void printResults() {
		//Print the Count for each possible answer to the Question.
		System.out.println("The question type is:  " + question.getType());
	    System.out.println("The question is:  " + question.getQuestion());
	    System.out.println("The answer is: " + question.getAnswer());
		System.out.println("The results are: ");
		for (int i = 0; i < question.getOptions().length; i++) {
			System.out.println(question.getOptions()[i] + ": " + count[i]);
		}
		
		System.out.println("---------------------------------------------");
	}
}
