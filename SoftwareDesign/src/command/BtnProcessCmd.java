package command;

import java.io.IOException;

import javax.swing.JButton;

import model.Subject;
import opennlp.tools.util.InvalidFormatException;
import strategy.ProcessStrategy;

public class BtnProcessCmd extends JButton implements Command {
	
	private Subject txtData;
	private ProcessStrategy processStrategy ;
	//Context context = new Context(new SentenceDetectionStrategy());
	public BtnProcessCmd(String caption, Subject txtData) {
		// TODO Auto-generated constructor stub
		super(caption);
		this.txtData = txtData;
	}

	@Override
	public void execute() throws InvalidFormatException, IOException {
		
		processStrategy= this.txtData.getProcessStrategy();
		processStrategy.doAnalyseAlgoritm(txtData);
	}
}
