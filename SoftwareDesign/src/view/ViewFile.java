package view;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ViewFile extends JScrollPane implements Observer {
	
	private JTextArea txtArea = new JTextArea("txt area created"); // New  txt area with default txt	
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
		this.setSize(250,250);
	}
	
	
	@Override
	public void update(String str1,String path,String algorithm,String dbms) {
		// Updates the testArea with new string. This also needs work but provides proof of concept
		String output = "default string" + str1 + "File path is:"+path+"selected algorithm is:"+algorithm+"selected DBMS is:"+dbms;
		//this.txtArea.setText(str1 +this.txtArea.getText());	
		this.txtArea.setText(this.txtArea.getText()+"/n"+output);
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

	public void setText(String string){
		this.txtArea.setText(string);
	}

}
