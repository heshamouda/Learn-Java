package javaSwing;

import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class Jpassword {

	public static void main(String[] args) {
		JPasswordField pw = new JPasswordField();
		JFrame f = new JFrame("Password");
		f.setSize(400, 400);
		f.setLayout(null);

		pw.setBounds(120, 50, 140, 20);

		JLabel lb = new JLabel("Enter Password");
		lb.setBounds(10, 50, 100, 20);

		f.add(lb);
		f.add(pw);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
