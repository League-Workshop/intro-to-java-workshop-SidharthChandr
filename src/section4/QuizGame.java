package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		int score=0;
		String y=JOptionPane.showInputDialog("what is 1+5?");
		if(y.equals("6")) {
			JOptionPane.showMessageDialog(null, "correct");
			score=score+1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Fail");
			score=score-1;
		}
		JOptionPane.showMessageDialog(null, "Score: "+score);
		String z=JOptionPane.showInputDialog(null, "what is 6+5?");
		if(z.equals("11")) {
			JOptionPane.showMessageDialog(null, "correct");
			score=score+1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Fail");
			score=score+1;
		}
		JOptionPane.showMessageDialog(null, "Score: "+score);
		String c=JOptionPane.showInputDialog(null, "what is 6+7?");
		if(c.equals("13")) {
			JOptionPane.showMessageDialog(null, "correct");
			score=score+1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Fail");
			score=score+1;
		}
		JOptionPane.showMessageDialog(null, "Score: "+score);
		String d=JOptionPane.showInputDialog(null, "what is 6+8?");
		if(d.equals("14")) {
			JOptionPane.showMessageDialog(null, "correct");
			score=score+1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Fail");
			score=score+1;
		}
		JOptionPane.showMessageDialog(null, "Score: "+score);
		
		// 1.  Create a variable to hold the user's score 
		
		// 2.  Ask the user a question 
		
		// 3.  Use an if statement to check if their answer is correct
		
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
