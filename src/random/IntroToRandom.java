//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.SingleSelectionModel;

public class IntroToRandom {
	public static void main(String[] args) {
		
		//3. Now make r random. 
		Random random = new Random();
		//   Create an object of the Random class
		//	 use .nextInt() to get a random number
int number1 = random.nextInt(10);
		//4. Limit the random number between 0 and 100
int number2 = random.nextInt(101);
		//5. Limit the random number between 25 and 75. Hint: ((highest value - lowest value)+1) + lowest value
int number3 = random.nextInt(51) + 25;
		//6. Challenge: Limit the random number between -222 and 88
int number4 = random.nextInt(311) - 222;
int number5 = random.nextInt(100);
		//1. Print out the value of r
	System.out.println(number1);
	System.out.println(number2);
	System.out.println(number3);
	System.out.println(number4);
	System.out.println(number5);
		//2. Run the program.  What number appears in the console?
		//   Run it again. Is the number the same?
	}
}