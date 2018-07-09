
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will make sure the program exits when you
																	// close the window

		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image Address”)
		String image = "https://media.mnn.com/assets/images/2015/03/Goldcrest_1%20copy.jpg.653x0_q80_crop-smart.jpg";
		// 2. declare a variable of type "Component" that will hold your image
		Component bird;
		// 3. use the "createImage()" method below to initialize your Component
		bird = createImage(image);
		// 4. add the image to the quiz window
		quizWindow.add(bird);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String answer = JOptionPane.showInputDialog("What is this an image of?");
		// 7. print "CORRECT" if the user gave the right answer
		if (answer.equals("bird")) {
			JOptionPane.showMessageDialog(null, "Yep");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "No dude, its a bird");
		}
		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
		quizWindow.remove(bird);
		// 10. find another image and create it (might take more than one line of code)
		String image2 = "https://5.imimg.com/data5/WA/SH/MY-43060348/japanese-koi-500x500.jpg";
		Component fish;
		fish = createImage(image2);
		// 11. add the second image to the quiz window
		quizWindow.add(fish);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String answer2 = JOptionPane.showInputDialog("What is this an image of?");
		// 7. print "CORRECT" if the user gave the right answer
		if (answer2.equals("fish")) {
			JOptionPane.showMessageDialog(null, "Yep");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "No dude, its fish");
		}
		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
