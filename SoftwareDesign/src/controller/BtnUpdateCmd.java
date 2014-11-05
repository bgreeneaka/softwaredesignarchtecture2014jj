package controller;

import javax.swing.JButton;

import model.TextData;

public class BtnUpdateCmd extends JButton implements Command {
	
	private TextData txtData;
	
	public BtnUpdateCmd(String caption, TextData txtData) {
		// TODO Auto-generated constructor stub
		super(caption);
		this.txtData = txtData;
	}

	@Override
	public void execute() {
		this.txtData.str1 = "Update hit";
		// TODO Auto-generated method stub
		//this.txtData.editText(" HAS NOW BEEN UPDATED");
		this.txtData.notifyObservers();
	}

}
