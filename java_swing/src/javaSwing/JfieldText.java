package javaSwing;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class JfieldText {

	public static void main(String[] args) {
		JFrame f = new JFrame("Frame  of Textfield");
		f.setSize(500, 500);
		JTextField tf1, tf2;
		tf1 = new JTextField("Enter name");
		tf1.setBounds(10, 20, 250, 30);
		tf2 = new JTextField("Enter address");
		tf2.setBounds(10, 55, 250, 30);
		f.add(tf2);
		f.add(tf1);

		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
