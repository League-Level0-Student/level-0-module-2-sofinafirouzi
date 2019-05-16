package random;

import javax.swing.JOptionPane;

public class rollarcoaster extends RockPaperScissors {
public static void main(String[] args) {
	String height = JOptionPane.showInputDialog("What is your height? (in inches)"); 
	Integer.parseInt(height);
	int number = Integer.parseInt(height);
if(number >= 48) {
	JOptionPane.showMessageDialog(null, "You can ride the rollar coaster!");
}
else {
	JOptionPane.showMessageDialog(null, "Sorry, you need to grow more before you can ride!");
}

		
	}
	
	
	
}

