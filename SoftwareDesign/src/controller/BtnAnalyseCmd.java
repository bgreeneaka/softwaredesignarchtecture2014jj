package controller;

import java.io.IOException;

import javax.swing.JButton;

import opennlp.tools.util.InvalidFormatException;
import model.TextData;
import view.ViewFile;

public class BtnAnalyseCmd extends JButton implements Command {
	
	private TextData txtData;
	private algorithm alg;
	public BtnAnalyseCmd(String caption, TextData txtData) {
		// TODO Auto-generated constructor stub
		super(caption);
		this.txtData = txtData;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
				this.txtData.algorithm = "NLP1";
				this.txtData.notifyObservers();
				alg = new NLPTest();
				try {
					alg.setAnalyseAlgoritm(this.txtData.path);
				} catch (InvalidFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

}
