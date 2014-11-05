package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;

import model.TextData;
import view.ViewFile;

public class BtnOpenCmd extends JButton implements Command {

	private ViewFile fileView;
	private TextData txtData;
	
	public BtnOpenCmd(String caption, ViewFile fileView, TextData txtData){
		super(caption);
		this.fileView = fileView;
		
	}
	
	@Override
	public void execute() {
		// opens file when execute is called. Selects file and reads txt from file. Adds to a string, this string sets the text of the view
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.showOpenDialog(null);
		File file = fileChooser.getSelectedFile();
		String output ="";
		
		try {
	        Scanner sc = new Scanner(file);

	        while (sc.hasNextLine()) {
	            String i = sc.next();
	            System.out.println(i);
	            output += " "+ i;
	        }
	        sc.close();
	    } 
		
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
		//this.txtData.path = file.toString();
		this.fileView.setText(output);
	}

}
