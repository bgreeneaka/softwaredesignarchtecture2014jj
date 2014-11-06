package controller;

import javax.swing.JButton;

import model.TextData;


public class BtnAnalyseCmd extends JButton implements Command {
	

	private algorithm algorithm;
	private TextData txtData;
	
	public BtnAnalyseCmd(String caption, TextData txtData) {
		// TODO Auto-generated constructor stub
		super(caption);
		this.txtData = txtData;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
			// will call algorithm
		// for testing
		
				System.out.println("Analyse Clicked");
				this.txtData.notifyObservers();
	}

}
