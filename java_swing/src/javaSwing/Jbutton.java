/**
 * 
 */
package javaSwing;

/**
 * 
 */

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * @author Hesham Ouda
 *
 */
public class Jbutton implements ActionListener {

	private JButton bt = new JButton("Click on");

	public Jbutton() {
		JFrame frame = new JFrame();
		bt.setBounds(50, 50, 90, 50);
		frame.add(bt);
		frame.setSize(300, 300);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bt.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bt) {
			System.exit(1);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Jbutton();

	}

}
