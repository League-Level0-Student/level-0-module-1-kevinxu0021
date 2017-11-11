
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String Matt = "invisibility";
		String Jaren = "teleportation";
		String Kevin = "flying";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String name = JOptionPane.showInputDialog("What is your name");
		// 3. Show the superpower in a pop-up, depending on the name entered.
		if (name.equals("Matt")) {
			JOptionPane.showMessageDialog(null, "Your super power is " + Matt);
		} else if (name.equals("Jaren")) {
			JOptionPane.showMessageDialog(null, "Your super power is " + Jaren);
		} else if (name.equals("Kevin")) {
			JOptionPane.showMessageDialog(null, "Your super power is " + Kevin);
		} else {
			JOptionPane.showMessageDialog(null, "You don't have a superpower");
		}
	}
}
