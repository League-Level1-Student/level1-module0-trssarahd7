
/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. Tell them which year they
 * were born. If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
	public static void main(String[] args) {

		String strage = JOptionPane.showInputDialog("What is your age?");
		int intage = Integer.parseInt(strage);

		int yage = 2018 - intage;
		JOptionPane.showMessageDialog(null, "You were born in " + yage);

		if (intage >= 30) {
			JOptionPane.showMessageDialog(null, "You are too old to play this game.");

		}
	}
}
