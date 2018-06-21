//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		String ans1 = JOptionPane.showInputDialog("How many nickels do you have?");
		
		String ans2 = JOptionPane.showInputDialog("How many dimes do you have?");
		
		String ans3 = JOptionPane.showInputDialog("How many quarters do you have");
		
		int a = Integer.parseInt(ans1);
		int b = Integer.parseInt(ans2);
		int c = Integer.parseInt(ans3);
		
		double d = a * 0.05;
		double e = b * 0.1;
		double f = c * 0.25;
		
		double n = d + e + f;
		// Convert their answer to an int using Integer.parseInt()

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has and save it in a double variable 

		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "You have $" + n);

	}
}

