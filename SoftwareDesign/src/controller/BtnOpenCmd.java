package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;

import view.ViewFile;

public class BtnOpenCmd extends JButton implements Command {

	private ViewFile fileView;
	
	public BtnOpenCmd(String caption, ViewFile fileView){
		super(caption);
		this.fileView = fileView;
		
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
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
		
		this.fileView.setText(output);
	}

}
