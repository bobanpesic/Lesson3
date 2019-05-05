package exercises;
import javax.swing.JOptionPane;

/* See the diagram in the "doc" directory. */

public class AreYouHappy {

	public static void main(String[] args) {


		String answer = JOptionPane.showInputDialog("Are you happy?");

	
	 if (answer.equals("Yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever  you're doing");
       }
		
	if (answer.equals("No")) {
		 String answer2 = JOptionPane.showInputDialog("Do you want to be happy?");
		
            if (answer2.equals("Yes")) {
	           JOptionPane.showMessageDialog(null, "Change something");
           }
              else if (answer2.equals("No")){
			  JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		   }
		 
               else {
			  JOptionPane.showMessageDialog(null, "Wrong input, please try again");
		   }
	
	   }
    }

	
	}
     
	 
		
	 

	    
	
	

