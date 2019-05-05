package exercises;


import java.util.Random;

import javax.swing.JOptionPane;
public class HighLowGame {


	public static void main(String[] args) {

		Random random = new Random();
		int randomNumber = random.nextInt(101);

		boolean userGuess = false;
		String userInput;
		int userNumber;

		while(!userGuess)
		{
			userInput = JOptionPane.showInputDialog("Guess the number ");
			userNumber = Integer.parseInt(userInput);
			
			if(userNumber > randomNumber){
				JOptionPane.showInputDialog(null, "High number, please try again.");	
			} else if (userNumber < randomNumber){
				JOptionPane.showInputDialog(null, "Low number, please try again.");
			} else {
				JOptionPane.showMessageDialog(null, "Congratulations!");
				userGuess = true;				
			}

		}
		System.exit(0);

	}


}
