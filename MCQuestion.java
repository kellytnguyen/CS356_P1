//Kelly Nguyen
//CS356-01 Object-Oriented Programming  
//MWF 10:30AM - 11:35AM
//Project #1: iClicker Simulator

public class MCQuestion extends Question {
	
	public MCQuestion(String question, String answer) {
		setQuestion(question);
		setAnswer(answer);
		setType("Multiple Choice");
		setOptions(new String[] {"A", "B", "C", "D"});	
	}

}
