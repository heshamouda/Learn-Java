package javaSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Jradiobutton extends JFrame implements ActionListener{
	private JRadioButton r1, r2;
	JButton bt;
	private JFrame f = new JFrame("RdioButton exemple");
	
	public Jradiobutton() {
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
		r1 = new JRadioButton("Male");
		r1.setBounds(70, 50, 100, 35);
		
		r2 = new JRadioButton("Female");
		r2.setBounds(70, 100, 100, 35);
		
		bt = new JButton("Cick");
		bt.setBounds(70, 150, 80, 35);
		bt.addActionListener(this);
		
		ButtonGroup g = new ButtonGroup();
		g.add(r1);
		g.add(r2);
		
		f.add(r1);
		f.add(r2);
		f.add(bt);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (r1.isSelected()) {
			JOptionPane.showMessageDialog(this, "You are male");
		}
		if (r2.isSelected()) {
			JOptionPane.showMessageDialog(this, "You are female");
		} 
		 if (!(r1.isSelected() && r2.isSelected())) {
			JOptionPane.showMessageDialog(this, "make choice");
		}
	}
	public static void main(String[] args) {
		new Jradiobutton();
	}
}
