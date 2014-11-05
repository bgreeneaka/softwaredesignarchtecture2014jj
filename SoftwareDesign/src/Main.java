
import java.awt.BorderLayout;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JPanel;

import opennlp.tools.util.InvalidFormatException;
import controller.BtnAnalyseCmd;
import controller.BtnOpenCmd;
import controller.BtnUpdateCmd;
import controller.Controller;
import controller.FileOpenCommand;
import view.ButtonPanel;
import view.DisplayStats;
import view.MainUI;
import view.Observer;
import view.ObserverFactory;
import view.View;
import view.ViewFile;
import model.TextData;


public class Main {
	public static void main(String[] args) throws InvalidFormatException, IOException {
	// TODO Auto-generated method stub

	TextData txtData = new TextData(); // (Model) Create new subject/ model which holds all data 
	System.out.println("Txt Data Created");	//FOR TESTING
	
	ObserverFactory observerFactory = new ObserverFactory("File View");
	View view = observerFactory.createObserver().getView();

	
	BtnOpenCmd btnOpenFile = new BtnOpenCmd("Open File", view);
	BtnAnalyseCmd btnAnalyse = new BtnAnalyseCmd("Analyse", txtData);	
	BtnUpdateCmd btnUpdateView = new BtnUpdateCmd("Update View", txtData);
	ButtonPanel btnPanel = new ButtonPanel(btnOpenFile,btnUpdateView,btnAnalyse);
	
	MainUI ui = new MainUI();
	ui.add(view,BorderLayout.CENTER);
	ui.add(btnPanel, BorderLayout.LINE_START);
	
	txtData.registerObserver(ui);
	txtData.registerObserver((Observer) observerFactory.createObserver());
	txtData.registerObserver(btnPanel);
	
	Controller controller  = new Controller(txtData);
//	controller.addModel("textData",txtData);
//	controller.addListnersToModels();
	}
	
}

