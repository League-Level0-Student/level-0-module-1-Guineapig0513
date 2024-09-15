package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;

		
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		// 4. If they got the answer right, pop up "correct!" and increase the score by
				// one
		String candle = JOptionPane.showInputDialog("I'm tall when I'm young and I'm short when I'm old. What am I?");
	
		if (candle.equalsIgnoreCase("Candle")) {
			JOptionPane.showMessageDialog(null, "Correct :D It is candle!");
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong >:( the answer was candle!");
		}
		String egg = JOptionPane.showInputDialog("What can be used when it is broken? ");
		
		if (egg.equalsIgnoreCase("egg")) {
			JOptionPane.showMessageDialog(null, "Correct :D it is an egg!");
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong >:( the answer was egg!");
		}
		String piano = JOptionPane.showInputDialog("What has many keys but can't open a single lock?");
		
		if (piano.equalsIgnoreCase("piano")) {
			JOptionPane.showMessageDialog(null, "Correct :D It is piano!");
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong >:( the answer was piano!");
		}
		String ice = JOptionPane.showInputDialog("What is made of water but if you put it into water it will die?");
		
		if (ice.equalsIgnoreCase("ice")) {
			JOptionPane.showMessageDialog(null, "Correct :D It is ice!");
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong >:( the answer was ice!");
		}
String meat = JOptionPane.showInputDialog("Paul's height is six feet, he's an assistant at a butcher's shop, and wears size 9 shoes. What does he weigh?");
		
		if (meat.equalsIgnoreCase("meat")) {
			JOptionPane.showMessageDialog(null, "Correct :D It is meat!");
			score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong >:( the answer was meat!");
		}
		JOptionPane.showMessageDialog(null, "your score is " +score+ " you did great! Also one more question!");
String potato = JOptionPane.showInputDialog("I have sleek and fluffy fur and I have white and brown and orange on my coat. I wheek as loud as a fire alarm and eat more healthy than Liam. What am I?");
		
		if (potato.equalsIgnoreCase("Polly")) {
			JOptionPane.showMessageDialog(null, "Correct :D It is polly!");
			score += 1;
		} else { 
			score -= 1000;
			JOptionPane.showMessageDialog(null, "Wrong >:( the answer was polly!");
		}
		JOptionPane.showMessageDialog(null, "your new score is " +score+ " I hope you did good :D! ");
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.

	}
}
