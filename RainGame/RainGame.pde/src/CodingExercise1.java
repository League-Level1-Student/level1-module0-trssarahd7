import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

	public static void main(String[] args) {

		Robot bob = new Robot();
		bob.penDown();
		bob.setSpeed(100);
		bob.setPenWidth(10);
		// 3. ask the user what color they would like the Robot to draw
		String color = JOptionPane.showInputDialog("What color do you want the robot's shape to be?");
		{
			// 4. use an if/else statement to set the pen color that the user requested
			if (color.equals("red")) {
				bob.setPenColor(255, 0, 0);
			}

			else if (color.equals("green")) {
				bob.setPenColor(0, 255, 0);
			}

			else if (color.equals("blue")) {
				bob.setPenColor(0, 0, 255);
			}

			else {
				bob.setRandomPenColor();
			}
		}
		// (minimum of 2 colors)

		// 2. set the pen width to ten (up top)

		// 1. make the Robot draw a shape
		for (

				int i = 0; i < 3; i++) {

			bob.turn(120);
			bob.move(100);

		}

	}

}
