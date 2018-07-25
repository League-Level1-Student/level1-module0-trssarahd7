package extra;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Ouch implements KeyListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Make a program that says “ouch” every time a key is pressed. You can use the
		// speak() method below.
		new Ouch().GUI();
	}

	public void GUI() {

		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.pack();
		frame.addKeyListener(this);

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Key Pressed, Ouch spoken");
		speak();

	}

	private void speak() {
		// TODO Auto-generated method stub
		try {
			Runtime.getRuntime().exec("say Ouch").waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
