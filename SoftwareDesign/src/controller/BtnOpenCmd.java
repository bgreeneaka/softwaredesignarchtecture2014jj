
package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;

import model.TextData;
import view.View;
import view.ViewFile;

public class BtnOpenCmd extends JButton implements Command {

	private View fileView;
	private TextData txtData;
	
	public BtnOpenCmd(String caption, View fileView, TextData txtData){
		super(caption);
		this.txtData = txtData;
		this.fileView = fileView;
		
	}
	
	@Override
	public void execute() {
		// opens file when execute is called. Selects file and reads txt from file. Adds to a string, this string sets the text of the view
		
		//this.txtData.path = "path";
		String path;
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.showOpenDialog(null);
		File file = fileChooser.getSelectedFile();
		String output ="";
		
		try {
	        Scanner sc = new Scanner(file);
	        StringBuffer stringBuffer = new StringBuffer();
	        while (sc.hasNextLine()) {
	        	stringBuffer.append(sc);
	            String i = sc.next();
	            System.out.println(i);
	            output += " "+ i;
	        }
	        sc.close();
	    } 
		
	    catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
		path= file.getPath();
		path = pathNormalize(path);
		this.txtData.setPath(path);
		String p = txtData.path;	
		//this.fileView.setTextArea(output);
		this.txtData.setTextData(output, p, "algorithm", "dbms");
		this.txtData.notifyObservers();
	}
	private String pathNormalize(String path){
		
	String output="";
		for (char ch: path.toCharArray()) {
			if (ch=='\\'){
			ch='/';
			
			}
			output=output+ch;
		}
		
		return output;
	}
}

