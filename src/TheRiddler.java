import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer = JOptionPane
				.showInputDialog("Answer this riddle,\"Which word in the dictionary is spelled incorrectly?\"");

		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (answer.equals("incorrectly")) {
			score = score + 1;
			JOptionPane.showInternalMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong. The answer is incorrectly");
		}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
		String answer1 = JOptionPane.showInputDialog(
				"Answer this riddle,\"What has cities, but no houses; forests, but no trees; and water, but no fish?\" ");
		if (answer1.equals("A map")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong. The answer is A map");
		}
		String answer2 = JOptionPane.showInputDialog(
				"Answer this riddle,\"A man is trapped in a room. The room has only two possible exits: two doors. Through the first door there is a room constructed from magnifying glass. The blazing hot sun instantly fries anything or anyone that enters. Through the second door there is a fire-breathing dragon. How does the man escape?\"");
		if (answer2.equals("He waits until night time and then goes through the first door.")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Correct");
		} else {
			JOptionPane.showMessageDialog(null,
					"Wrong. The answer is He waits until night time and then goes through the first door.");
			// 2. Make a pop up to show the score.
			JOptionPane.showMessageDialog(null, score);
		}
	}
}
