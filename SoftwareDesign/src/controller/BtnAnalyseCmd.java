package controller;

import javax.swing.JButton;

import model.TextData;

public class BtnAnalyseCmd extends JButton implements Command {
	
	private TextData txtData;
	
	public BtnAnalyseCmd(String caption, TextData txtData) {
		// TODO Auto-generated constructor stub
		super(caption);
		this.txtData = txtData;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.txtData.editText(" HAS NOW BEEN ANALYSED");
		System.out.println("executing analyse");
	}

}
