package com.HeshamOuda.view;

import com.HeshamOuda.constants.Constants;
import com.HeshamOuda.controller.Controller;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.Spring;

public class MainFrame extends JFrame implements FormListener {
	private static final long serislVersionUID = 1L;
	private FormPanel formPanel;
	private TextPanel textPanel;
	private Controller controller;

	public MainFrame() {
		super(Constants.APP_TITLE);

		initializeClass();
		setLayout();
	}

	private void setLayout() {
		add(this.formPanel, BorderLayout.WEST);
		add(this.textPanel, BorderLayout.CENTER);

		setSize(700, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void initializeClass() {
		this.controller = new Controller(this);
		this.formPanel = new FormPanel();
		this.formPanel.setFormListener(this);
		this.textPanel = new TextPanel();
	}

	@Override
	public void okButtonClicked(String personName, String persOccupation) {
		this.controller.addPerson(personName, persOccupation);
		this.controller.refreshScreen();
	}

	public void refreshTextArea(String name, String occupation) {
		this.textPanel.addText(name + " - " + occupation);
	}

	public void clearText() {
		this.textPanel.clearText();
	}
}
