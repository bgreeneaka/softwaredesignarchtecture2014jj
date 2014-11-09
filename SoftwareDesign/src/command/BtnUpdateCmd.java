package command;

import javax.swing.JButton;

import model.Subject;
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
		this.txtData.setData("Update hit"); 
		// TODO Auto-generated method stub
		//this.txtData.editText(" HAS NOW BEEN UPDATED");
		this.txtData.notifyObservers();
	}

}
