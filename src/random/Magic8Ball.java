//    Copyright (c) The League of Amazing Programmers 2013-2018
//    Level 0


package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {



// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

int random = new Random().nextInt(3);
	// 3. Print out this variable
System.out.println(random);
	// 4. Get the user to enter a question for the 8 ball
String number = JOptionPane.showInputDialog("Enter a question for the 8 ball"); {
	// 5. If the random number is 0
if( number.equals("0")) {
	// -- tell the user "Yes"
JOptionPane.showMessageDialog(null, "Yes");
}
	// 6. If the random number is 1
if( number.equals("1")) {
	// -- tell the user "No"
JOptionPane.showMessageDialog(null, "No");
}
	// 7. If the random number is 2
if( number.equals("2")) {
	// -- tell the user "Maybe you should ask Google?"
JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
}
	// 8. If the random number is 3
if( number.equals("3")) {
	// -- write your own answer
	JOptionPane.showMessageDialog(null, "Maybe");
}
}
}
}
