package controller;

import javax.swing.JButton;
import javax.swing.JFileChooser;

public class BtnOpenCmd extends JButton implements Command {

	
	public BtnOpenCmd(String caption){
		super(caption);
		
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.showOpenDialog(null);
	}

}
