
package view;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.*;

import model.Subject;

public class ViewFile extends View implements Observer {
	
	private Subject txtData;
	
	private JTextArea txtArea = new JTextArea("Open File to process"); // New  txt area with default txt	
	/*
	 * Creates a panel 
	 * 
	 */
	public ViewFile(Subject txtData) {
		this.txtData = txtData;
		txtData.registerObserver((Observer)this);		
		JPanel panel = new JPanel();
		
		txtArea.setLineWrap(true);
		txtArea.setEditable(false);
		
		JScrollPane scroll = new JScrollPane(txtArea);
		scroll.setPreferredSize(new Dimension(650,675));
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
	public void update() {
		this.txtArea.setText(txtData.getData());
	}

	/*
	 * Add's action listener to the update button. This might be incorrect because it is in the observer and the subject
	 * 
	 */

	public void setText(String string){
		this.txtArea.setText(string);
	}

	@Override
	public void addActionListener(ActionListener commandListner) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addItemListener(ItemListener itemListener) {
		// TODO Auto-generated method stub
		
	}

}

