package javaSwing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.sun.jdi.Value;

import java.awt.event.*;

public class ActionListenerTField implements ActionListener {

	private JFrame f = new JFrame("actionTextfield");
	private JTextField tf1, tf2, tf3;
	private JButton bt1, bt2;

	public ActionListenerTField() {
		f.setSize(500, 500);

		tf1 = new JTextField();
		tf1.setBounds(10, 50, 150, 30);
		tf2 = new JTextField();
		tf2.setBounds(10, 85, 150, 30);
		tf3 = new JTextField();
		tf3.setBounds(250, 85, 150, 30);
		tf3.setEditable(false);

		bt1 = new JButton("+");
		bt1.setBounds(10, 20, 60, 20);
		bt2 = new JButton("-");
		bt2.setBounds(100, 20, 60, 20);

		bt1.addActionListener(this);
		bt2.addActionListener(this);

		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(bt1);
		f.add(bt2);

		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new ActionListenerTField();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int a = Integer.parseInt(tf1.getText());
		int b = Integer.parseInt(tf2.getText());
		int c = 0;

		if (e.getSource().equals(bt1)) {
			c = a + b;
		}

		if (e.getSource().equals(bt2)) {
			c = a - b;
		}
		String result = String.valueOf(c);
		tf3.setText(result);
	}
}
