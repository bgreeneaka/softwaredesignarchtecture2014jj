package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.TextData;

public class Controller {
	
	private TextData txtData;
	//TODO remove this parameter !fileView!
	//private OpenFile fileView; //not needed just here for testing 
	
	public Controller(TextData txtData) {
		// Constructor
		//this.fileView = fileView;
		this.txtData = txtData;
		this.txtData.addUpdateListner(new CommandListner()); //Add update listener to the model. DO NOT KNOW IF THE LOGIC IS CORRECT HERE
	}

//	public class UpdateListner implements ActionListener {
//		//Action for when update is pushed
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			txtData.editText(" HAS NOW BEEN UPDATED");//Just for testing to see if update committed
//			//fileView.update(txtData.getString());
//		}
//	}
	
	public class CommandListner implements ActionListener {
		//Action for when update is pushed
		@Override
		public void actionPerformed(ActionEvent e) {
			Command action = (Command) e.getSource();
			action.execute();
		}
		
	public class StrategyListner implements ActionListener {
			//Action for when update is pushed
			@Override
		public void actionPerformed(ActionEvent e) {
				String s = (String) e.getSource();
				System.out.println(s);
				//s.analyse();
			}

	}

	}
}

