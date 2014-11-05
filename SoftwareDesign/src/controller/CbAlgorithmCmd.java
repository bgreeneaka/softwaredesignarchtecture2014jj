package controller;

import javax.swing.JButton;
import javax.swing.JComboBox;

import model.TextData;

public class CbAlgorithmCmd extends JComboBox implements Command {
	
	private TextData txtData;
	public CbAlgorithmCmd(String[] Selection, TextData txtData) {
		// TODO Auto-generated constructor stub
		super(Selection);
		this.txtData = txtData;
	}
@Override
public void execute() {
	//this.txtData.algorithm ;
	System.out.println("wwww");
	this.txtData.algorithm = "test";	
	this.txtData.notifyObservers();
}
}