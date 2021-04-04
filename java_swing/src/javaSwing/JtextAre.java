package javaSwing;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class JtextAre {
	JtextAre(){
		JFrame f = new JFrame("Text Area");

		JTextArea area = new JTextArea("Welcome message");
		area.setBounds(20, 20, 300, 300);
		f.add(area);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
public static void main(String[] args) {
	new JtextAre();
}
	
	
}
