package random;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("How old are you?");
	Integer.parseInt(age);
	int number = Integer.parseInt(age);
	if(number >= 18) {
		JOptionPane.showMessageDialog(null, "Who should the next president be?");
	}
	else {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think");
	}
	}
}

