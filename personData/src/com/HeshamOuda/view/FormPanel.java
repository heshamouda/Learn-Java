package com.HeshamOuda.view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormPanel extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JTextField nameField;
	private JTextField occupationField;
	private JButton oKButton;
	private FormListener formListener;

	/**
	 * 
	 */
	public FormPanel() {
		initializeClass();
		setDimensions();
		set_layout();
	}

	private void set_layout() {

		setLayout(new GridBagLayout());

		add(new JLabel("Name: "), new GridBagConstraints(0, 0, 0, 0, 1, 0.3, GridBagConstraints.LINE_END,
				GridBagConstraints.NONE, new Insets(5, 5, 5, 5), 0, 0));

		GridBagConstraints gConst = new GridBagConstraints();
		gConst.gridx++;
		gConst.gridy = 0;
		gConst.anchor = GridBagConstraints.LINE_START;
		add(nameField, gConst);

		// new row

		gConst.gridy++;
		gConst.gridx = 0;
		gConst.weightx = 1;
		gConst.weighty = 0.4;
		gConst.fill = GridBagConstraints.NONE;
		gConst.anchor = GridBagConstraints.LINE_END;

		add(new JLabel("Occupation: "), gConst);

		gConst.gridx++;
		gConst.gridy = 1;
		gConst.anchor = GridBagConstraints.LINE_START;
		add(occupationField, gConst);

		// new row
		gConst.gridx = 0;
		gConst.gridy++;
		gConst.weightx = 1;
		gConst.weighty = 10;
		gConst.fill = GridBagConstraints.NONE;
		gConst.anchor = GridBagConstraints.FIRST_LINE_END;

		add(oKButton, gConst);

	}

	public void setFormListener(FormListener formListener) {
		this.formListener = formListener;
	}

	private void setDimensions() {
		Dimension dimension = getPreferredSize();
		dimension.width = 300;
		setPreferredSize(dimension);
		setMinimumSize(dimension);
	}

	private void initializeClass() {
		this.nameField = new JTextField(10);
		this.occupationField = new JTextField(10);
		this.oKButton = new JButton("OK");
		this.oKButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (this.formListener != null) {
			String personName = this.nameField.getText();
			String persOccupation = this.occupationField.getText();
			this.formListener.okButtonClicked(personName, persOccupation);
		}
	}
}
