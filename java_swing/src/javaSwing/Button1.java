package javaSwing;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Button1 {
	
	private JButton b = new JButton(new ImageIcon("/java_swing/src/utils/tel.jpg"));  
	private JFrame frame;
	 Button1() {
		 b = new JButton();
		 frame = new JFrame("Button1");

		 b.setBounds(50, 50, 140, 40);
		 b.add(new JLabel("Click"));
		 frame.add(b);
		 frame.setSize(400,400);		 
		 frame.setLayout(null);
		 frame.setVisible(true);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					
	}
	 
	 public static void main(String[] args) {
		new Button1();
	}
	

}
