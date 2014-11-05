
import java.awt.BorderLayout;
import java.io.IOException;

import javax.swing.JButton;

import opennlp.tools.util.InvalidFormatException;
import controller.BtnAnalyseCmd;
import controller.BtnOpenCmd;
import controller.BtnUpdateCmd;
import controller.Controller;
import controller.FileOpenCommand;

import view.ButtonPanel;

import view.DisplayStats;
import view.MainUI;
import view.ViewFile;
import model.TextData;


public class Main {
	public static void main(String[] args) throws InvalidFormatException, IOException {
	// TODO Auto-generated method stub
	System.out.println("Test");	


	TextData txtData = new TextData(); // (Model) Create new subject/ model which holds all data 
	System.out.println("Txt Data Created");	//FOR TESTING
	
	 //Create new controller and add the model to it
	

	
	ViewFile viewFile = new ViewFile();
	BtnUpdateCmd btnUpdateView = new BtnUpdateCmd("Update View", txtData);
	BtnOpenCmd btnOpenFile = new BtnOpenCmd("Open File", viewFile);
	BtnAnalyseCmd btnAnalyse = new BtnAnalyseCmd("Analyse", txtData);
	JButton btnAlg1 = new JButton("Alg 1");
	JButton btnAlg2 = new JButton("Alg 2");
	ButtonPanel btnPanel = new ButtonPanel(btnOpenFile,btnUpdateView,btnAnalyse);
	MainUI ui = new MainUI();
	ui.add(viewFile,BorderLayout.CENTER);
	ui.add(btnPanel, BorderLayout.LINE_START);
	txtData.registerObserver(ui);
	txtData.registerObserver(viewFile);
	txtData.registerObserver(btnPanel);
	Controller controller  = new Controller();
	controller.addModel("textData",txtData);
	controller.addListnersToModels();
	}
	
}

