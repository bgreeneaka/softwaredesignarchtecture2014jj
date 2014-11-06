
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
import controller.NLPTest;
import view.ButtonPanel;
import view.DBControlsPanel;
import view.DisplayStats;
import view.ControlPanel;
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

	BtnUpdateCmd btnUpdateView = new BtnUpdateCmd("Update View", txtData);
	BtnOpenCmd btnOpenFile = new BtnOpenCmd("Open File",view,txtData);
	BtnAnalyseCmd btnAnalyse = new BtnAnalyseCmd("Analyse", txtData);
	ButtonPanel btnPanel = new ButtonPanel(btnOpenFile,btnUpdateView,btnAnalyse);

	ControlPanel ctrlPanel = new ControlPanel(txtData);
	DBControlsPanel dbControls = new DBControlsPanel(txtData);

	MainUI ui = new MainUI();
	ui.add(view,BorderLayout.CENTER);
	ui.add(btnPanel, BorderLayout.LINE_START);
	ui.add(dbControls, BorderLayout.LINE_END);
	ui.add(ctrlPanel,BorderLayout.SOUTH);

	txtData.registerObserver(ui);
	txtData.registerObserver((Observer) view);
	txtData.registerObserver(btnPanel);

	Controller controller  = new Controller(txtData);

	}
	
}

