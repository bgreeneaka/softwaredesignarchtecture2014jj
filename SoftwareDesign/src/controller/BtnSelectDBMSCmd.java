package controller;

import javax.swing.JButton;

import model.TextData;
import view.View;

public class BtnSelectDBMSCmd extends JButton implements Command{

	private TextData txtData;
	
	public BtnSelectDBMSCmd(String caption,  TextData txtData){
		// TODO Auto-generated constructor stub
		super(caption);
		this.txtData = txtData;
		
	}
	@Override
	public void execute() {
		// will call DBMS
		// for testing
		System.out.println("selectDBMS Clicked");
		// TODO Auto-generated method stub
		this.txtData.notifyObservers();
		
	}

}
