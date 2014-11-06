package controller;

import javax.swing.JComboBox;

import model.TextData;

public class CbSelectedAlgorithmCmd extends JComboBox implements Command {

	private TextData txtData;
	public CbSelectedAlgorithmCmd(String[] Selection, TextData txtData) {
		// TODO Auto-generated constructor stub
		super(Selection);
		this.txtData = txtData;
	}
	@Override
	public void execute() {
		
		// TODO Auto-generated method stub
		
	}

}
