package Observer;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.*;

import Observer.Controller.UpdateListner;
import Observer.Observer;

public class OpenFile extends JFrame implements Observer {
	
	private JTextArea txtArea = new JTextArea("");
	private JButton updateButton = new JButton("Update View");
	
	
	public OpenFile() {
		JPanel openFilePanel = new JPanel();
		//this.setBorder(BorderFactory.createLineBorder(Color.black));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(200, 200);
		
		openFilePanel.add(txtArea);
		openFilePanel.add(updateButton);
		this.add(openFilePanel);
	}

	@Override
	public void update(String str1) {
		// TODO Auto-generated method stub
		this.txtArea.setText(str1);	
	}
	
	public String getText() {
		return txtArea.getText();
	}



	@Override
	public void addActionListener(ActionListener updateListner) {
		// TODO Auto-generated method stub
		updateButton.addActionListener(updateListner);
	}



}
