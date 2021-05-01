package com.HeshamOuda.view;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel extends JPanel {
	// private static final long SerialVersionUID = 1L;
	private JTextArea textArea;

	public TextPanel() {
		initializeClass();
		setLayout();
	}

	private void setLayout() {
		setLayout(new BorderLayout());
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(new JScrollPane(textArea), BorderLayout.CENTER);

	}

	private void initializeClass() {
		this.textArea = new JTextArea();
	}

	public void addText(String textString) {
		this.textArea.append(textString + "\n");
	}

	public void clearText() {
		this.textArea.setText("");
	}
}
