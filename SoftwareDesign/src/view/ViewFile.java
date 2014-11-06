
package view;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.*;

import model.Subject;

public class ViewFile extends View implements Observer {
	
	private JTextArea txtArea = new JTextArea("txt area created"); // New  txt area with default txt	
	/*
	 * Creates a panel 
	 * 
	 */
	public ViewFile(Subject txtData) {
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

	@Override
	public void addItemListener(ItemListener itemListener) {
		// TODO Auto-generated method stub
		
	}

}

