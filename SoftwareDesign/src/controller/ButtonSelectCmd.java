package controller;

import java.io.IOException;

import javax.swing.JButton;

import model.Subject;
import opennlp.tools.util.InvalidFormatException;

public class ButtonSelectCmd extends JButton implements Command {
	
	private Subject txtData;
	
	public ButtonSelectCmd(String caption,Subject txtData) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		
	}

}
