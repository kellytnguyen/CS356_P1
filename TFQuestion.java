//Kelly Nguyen
//CS356-01 Object-Oriented Programming  
//MWF 10:30AM - 11:35AM
//Project #1: iClicker Simulator

public class TFQuestion extends Question {
	
	public TFQuestion(String question, String answer) {
		setQuestion(question);
		setAnswer(answer);
		setType("True or False");
		setOptions(new String[] {"T", "F"});
	}

}
