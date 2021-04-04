/**
 * 
 */
package javaSwing;

/**
 * @author Hesham Ouda
 *
 */
import javax.swing.*;

public class Jlabel {
	JLabel l1, l2;
	JFrame f = new JFrame("JLABEL");
	
	public Jlabel() {	
		l1 = new JLabel("Label_1");
		l1.setBounds(10, 10, 100, 20);
		f.add(l1);
		l2 = new JLabel("Label_2");		
		l2.setBounds(10, 50, 100, 20);
		f.add(l2);
		
		f.setSize(500,500);
		f.setLayout(null); 
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {	 
		new Jlabel();		

	}

}
