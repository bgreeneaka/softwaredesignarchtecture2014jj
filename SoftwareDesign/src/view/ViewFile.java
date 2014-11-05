package view;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class ViewFile extends View implements Observer {
	
	private JTextArea txtArea = new JTextArea("txt area created"); // New  txt area with default txt	
	/*
	 * Creates a panel might need to be changed
	 */
	public ViewFile() {
		JPanel panel = new JPanel();
		txtArea.setLineWrap(true);
		JScrollPane scroll = new JScrollPane(txtArea);
		scroll.setPreferredSize(new Dimension(600,600));
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panel.add(scroll);
		this.add(panel);
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

	public void setTextArea(String string){
		this.txtArea.setText(string);
	}
	
	public View getView(){
		return this;	
	}


}
