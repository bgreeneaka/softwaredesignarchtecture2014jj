package controller;

import javax.swing.JFileChooser;
import javax.swing.JMenuItem;


public class FileOpenCommand extends JMenuItem implements Command {
	
	public FileOpenCommand (String caption){
		super(caption);
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("openfile"); // diagnostic
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.showOpenDialog(this);	
	}

}
