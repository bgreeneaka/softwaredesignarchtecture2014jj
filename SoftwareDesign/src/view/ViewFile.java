
package view;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import model.TextData;

public class ViewFile extends View implements Observer {
	
	private JTextArea txtArea = new JTextArea("txt area created"); // New  txt area with default txt	
	/*
	 * Creates a panel might need to be changed
	 * !!!!!!!!!!!!!!!!!!!!NEED TO ADD SUBJECT TO OBSERVER AND REGISTER IT HERE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	 */
	public ViewFile(TextData txtData) {
		txtData.registerObserver((Observer)this);
		JPanel panel = new JPanel();
		txtArea.setLineWrap(true);
		JScrollPane scroll = new JScrollPane(txtArea);
		scroll.setPreferredSize(new Dimension(600,600));
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panel.add(scroll);
		this.add(panel);
	}
		
	
	public String getText() {
		// This may not be required leave for the moment 
		return txtArea.getText();
	}

	
	public View getView(){
		return this;	
	}
	
	@Override
	public void update(String txtData,String path,String algorithm,String dbms) {
		// Updates the testArea with new string. This also needs work but provides proof of concept
		String output = "Default string is:" + "\nFile path is:"+path+"\nSelected algorithm is:"+algorithm+"\nSelected DBMS is:"+dbms;
		//this.txtArea.setText(str1 +this.txtArea.getText());	
		this.txtArea.setText(txtData+"\n"+output);
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

	public void setText(String string){
		this.txtArea.setText(string);
	}

}

