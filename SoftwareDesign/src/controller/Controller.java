package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;

import javax.swing.JComboBox;

import model.Subject;
import model.TextData;

public class Controller {
	
	private Subject txtData;
	
	public Controller(TextData txtData) {
		// Constructor
		this.txtData = txtData;
		this.txtData.addCommandListner(new CommandListner()); //Add Command listener to the model. 
		this.txtData.addStrategyListner(new StrategyListner()); //Add Strategy listener to the model. 
	}
	
	public class CommandListner implements ActionListener {
		//Action for when update is pushed
		@Override
		public void actionPerformed(ActionEvent e) {
			Command action = (Command) e.getSource();
			try {
				action.execute();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}	
	}
	
	public class StrategyListner implements ItemListener {
		//Adds selected algrothm to the subject when selected from the comboBox
		public void itemStateChanged(ItemEvent event) {
			JComboBox comboBox = (JComboBox) event.getSource();
			Object item = event.getItem();
			txtData.setAlgorithm(item.toString());
		}
	}
}

