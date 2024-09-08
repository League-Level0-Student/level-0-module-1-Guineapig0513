package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String nick = "uhhhhhhhhhhhh he has two catsss";
		String liam = "he can solve a rubix cube fast!";
		String jacob = "he likes guinea pigs.";
		// 2. Ask the user to enter a name. Store their answer in a variable.

		while(true) {
			String name = JOptionPane.showInputDialog("Type a name on the whiteboard (how its written)");
			// 3. In a pop-up, tell the user what is remarkable about that person. 
			if(name.equalsIgnoreCase("Nick")) {
				JOptionPane.showMessageDialog(null,  nick);
			}
			if(name.equalsIgnoreCase("Liam")) {
				JOptionPane.showMessageDialog(null,  liam);
			}

			if(name.equalsIgnoreCase("Jacob")) {
				JOptionPane.showMessageDialog(null,  jacob);
			}
		}
	}
}
