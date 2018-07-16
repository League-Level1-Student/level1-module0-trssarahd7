import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();
	}

	public void showButton() {

		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		button.addActionListener(this);
		JLabel label = new JLabel("Click for a fortune");
		button.add(label);
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Button clicked");
		int rand = new Random().nextInt(6);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "You will meet a tortise this week.");
		}
		if (rand == 1) {
			JOptionPane.showMessageDialog(null, "You will drink some really strong coffee next month.");
		}
		if (rand == 2) {
			JOptionPane.showMessageDialog(null, "Oprah Winfrey will adopt you.");
		}
		if (rand == 3) {
			JOptionPane.showMessageDialog(null, "You will forget how to walk tomorrow.");
		}
		if (rand == 4) {
			JOptionPane.showMessageDialog(null, "Your face is now a pie.");
		}
		if (rand == 5) {
			JOptionPane.showMessageDialog(null, "Three ghosts will follow you around for the day.");
		}
	}
}
