package view;
import java.awt.event.ActionListener;

import javax.swing.*;

public class OpenFile extends JPanel implements Observer {
	
	private JTextArea txtArea = new JTextArea(""); // New empty txt area
	private JButton updateButton = new JButton("Update View"); //New update button
	
	/*
	 * Creates a panel might need to be changed
	 */
	public OpenFile() {
		JPanel openFilePanel = new JPanel();
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(200, 200);
		
		openFilePanel.add(txtArea);
		openFilePanel.add(updateButton);
		
		this.add(openFilePanel);
	}
	
	
	@Override
	public void update(String str1) {
		// Updates the testArea with new string. This also needs work but provides proof of concept
		this.txtArea.setText(str1);	
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
		updateButton.addActionListener(updateListner);
	}



}
