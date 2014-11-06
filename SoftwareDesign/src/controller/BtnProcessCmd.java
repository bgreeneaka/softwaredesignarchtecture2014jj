package controller;

import java.io.IOException;

import javax.swing.JButton;

import model.Subject;
import model.TextData;
import opennlp.model.Context;
import opennlp.tools.util.InvalidFormatException;

public class BtnProcessCmd extends JButton implements Command {
	
	private Subject txtData;
	//Context context = new Context(new SentenceDetectionStrategy());
	public BtnProcessCmd(String caption, Subject txtData) {
		// TODO Auto-generated constructor stub
		super(caption);
		this.txtData = txtData;
	}

	@Override
	public void execute() throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		String selectedAlgorithm = this.txtData.getAlgorithm();
		if(selectedAlgorithm.equalsIgnoreCase("Detect Sentence")){
			Contex context = new Contex(new SentenceDetectionStrategy());
			context.executeStrategy(this.txtData);
		}else if(selectedAlgorithm.equalsIgnoreCase("Detect Tokens")){
			Contex context = new Contex(new Tokenize());
			context.executeStrategy(this.txtData);
		}else{
			System.out.println("No algorithm Selected");
		}
		
	}

}
