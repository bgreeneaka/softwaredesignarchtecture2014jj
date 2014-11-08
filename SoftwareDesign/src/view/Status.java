package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.*;

import model.Subject;

public class Status extends View implements Observer {
	
	private JTextArea txtArea = new JTextArea("Program status"); // New  txt area with default txt
	private JLabel status = new JLabel("File status");
	private Subject txtData;
	public Status(Subject txtData) {
		// TODO Auto-generated constructor stub
		txtData.registerObserver((Observer)this);
		this.txtData = txtData;
		setBackground(Color.GRAY);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		
		txtArea.setLineWrap(true);
		txtArea.setEditable(false);
		
		JScrollPane scroll = new JScrollPane(txtArea);
		scroll.setPreferredSize(new Dimension(800,50));
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		panel.add(scroll);
		this.add(status);
		this.add(panel);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		this.txtArea.setText("The Algorithm you have selected is : " + txtData.getAlgorithm() + "\n" +
		"The path of the file opened is : " + this.txtData.getPath() + "\n" + "The Database you have created is : " + this.txtData.getDbms());
	}

	@Override
	public void addActionListener(ActionListener commandListner) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addItemListener(ItemListener itemListener) {
		// TODO Auto-generated method stub
		
	}
	
	public View getView(){
		return this;	
	}

}
