package controller;

import java.io.IOException;
import javax.swing.JButton;
import opennlp.tools.util.InvalidFormatException;
import model.TextData;

public class BtnProcessCmd extends JButton implements Command {
	
	private TextData txtData;
	
	public BtnProcessCmd(String caption, TextData txtData) {
		// TODO Auto-generated constructor stub
		super(caption);
		this.txtData = txtData;
	}

	@Override
	public void execute() throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		String selectedAlgorithm = this.txtData.getAlgorithm();
		if(selectedAlgorithm.equalsIgnoreCase("Detect Sentence")){
			Context context = new Context(new SentenceDetectionStrategy());
			context.executeStrategy(this.txtData);
		}else{
			System.out.println("No algorithm Selected");
		}
		
	}

}
