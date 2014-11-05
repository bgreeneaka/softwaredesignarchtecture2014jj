
import java.awt.BorderLayout;
import java.io.IOException;

import javax.swing.JButton;

import opennlp.tools.util.InvalidFormatException;
import controller.BtnAnalyseCmd;
import controller.BtnOpenCmd;
import controller.BtnUpdateCmd;
import controller.CbAlgorithmCmd;
import controller.Controller;
import controller.FileOpenCommand;
import controller.NLPTest;
import view.ButtonPanel;
import view.DBControlsPanel;
import view.DisplayStats;
import view.ControlPanel;
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
	

	String[] algoritmsCollection= {"alg1", "alg2","alg3"};
	ViewFile viewFile = new ViewFile();
	BtnUpdateCmd btnUpdateView = new BtnUpdateCmd("Update View", txtData);
	BtnOpenCmd btnOpenFile = new BtnOpenCmd("Open File", viewFile,txtData);
	BtnAnalyseCmd btnAnalyse = new BtnAnalyseCmd("Analyse", txtData);
	CbAlgorithmCmd cbAlgoritm = new CbAlgorithmCmd(algoritmsCollection, txtData);
	//JButton btnAlg1 = new JButton("Alg 1");
	//JButton btnAlg2 = new JButton("Alg 2");
	ButtonPanel btnPanel = new ButtonPanel(btnOpenFile,btnUpdateView,btnAnalyse);
	ControlPanel ctrlPanel = new ControlPanel(cbAlgoritm,txtData);
	DBControlsPanel dbControls = new DBControlsPanel();
	MainUI ui = new MainUI();
	ui.add(viewFile,BorderLayout.CENTER);
	ui.add(btnPanel, BorderLayout.LINE_START);
	ui.add(dbControls, BorderLayout.LINE_END);
	ui.add(ctrlPanel,BorderLayout.SOUTH);
	txtData.registerObserver(ui);
	txtData.registerObserver(viewFile);
	txtData.registerObserver(btnPanel);
	Controller controller  = new Controller();
	controller.addModel("textData",txtData);
	controller.addListnersToModels();
	//NLPTest t = new NLPTest(); 
	
	}
	
}

