package view;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ViewFile extends JScrollPane implements Observer {
	
	private JTextArea txtArea = new JTextArea("txt area created"); // New empty txt area	
	/*
	 * Creates a panel might need to be changed
	 */
	public ViewFile() {
		this.txtArea.setLineWrap(true);
		this.txtArea.setPreferredSize(new Dimension(650,100));
		JScrollBar scrollBar = new JScrollBar();
		this.setRowHeaderView(scrollBar);
		this.setViewportView(txtArea);
		this.txtArea.setVisible(true);
		this.txtArea.setEditable(false);
	}
	
	
	@Override
	public void update(String str1) {
		// Updates the testArea with new string. This also needs work but provides proof of concept
		this.txtArea.setText(str1 +this.txtArea.getText());	
	}
	
	public String getText() {
		// This may not be required leave for the moment 
		return txtArea.getText();
	}
	
	/*
	 * Add's action listener to the update button. This might be incorrect because it is in the observer and the subject
	 * 
	 */
	@Override
	public void addActionListener(ActionListener updateListner) {
		// TODO Auto-generated method stub
		//updateButton.addActionListener(updateListner);
	}



}
