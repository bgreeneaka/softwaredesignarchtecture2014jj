
import java.awt.BorderLayout;
import java.io.IOException;

import opennlp.tools.util.InvalidFormatException;
import controller.BtnProcessCmd;
import controller.BtnOpenCmd;
import controller.BtnUpdateCmd;
import controller.BtnCreateDBCmd;
import controller.Controller;
import view.ButtonPanel;
import view.DBControlsPanel;
import view.MainUI;
import view.ObserverFactory;
import view.View;
import model.TextData;


public class Main {
	public static void main(String[] args) throws InvalidFormatException, IOException {
	// TODO Auto-generated method stub

	TextData txtData = new TextData(); // (Model) Create new subject/ model which holds all data 
	System.out.println("Txt Data Created");	//FOR TESTING
	
	ObserverFactory observerFactory2 = new ObserverFactory("Status", txtData);
	System.out.println("Status Created");
	View status = observerFactory2.createObserver().getView();
	System.out.println("Status added");
	
	ObserverFactory observerFactory = new ObserverFactory("File View", txtData);
	View view = observerFactory.createObserver().getView();
	
	ObserverFactory observerFactory3 = new ObserverFactory("btn panel", txtData);
	View btnPanel = observerFactory3.createObserver().getView();
	
	
	DBControlsPanel dbControls = new DBControlsPanel(txtData);


	BtnUpdateCmd btnUpdateView = new BtnUpdateCmd("Reset View", txtData);
	BtnOpenCmd btnOpenFile = new BtnOpenCmd("Open File",txtData);
	BtnProcessCmd btnProcess = new BtnProcessCmd("Process", txtData);
	BtnCreateDBCmd btnCreateDB = new BtnCreateDBCmd("Create", txtData);
	//ButtonPanel btnPanel = new ButtonPanel(txtData);
	
	
	((ButtonPanel) btnPanel).addBtnCommands(btnOpenFile, btnUpdateView, btnProcess);		
	dbControls.addBtnCommands(btnCreateDB);
	
	MainUI ui = new MainUI();
	ui.add(view,BorderLayout.CENTER);
	ui.add(btnPanel, BorderLayout.LINE_START);
	ui.add(dbControls, BorderLayout.LINE_END);
	System.out.println("dbControls added");
	ui.add(status, BorderLayout.PAGE_END);
	System.out.println("status added to ui");
	
	
	Controller controller  = new Controller(txtData);

	}
	
}

