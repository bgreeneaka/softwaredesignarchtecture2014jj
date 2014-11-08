
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
	
	ObserverFactory observerFactory_fileView, observerFactory_status, observerFactory_btnPanel;

	observerFactory_fileView = new ObserverFactory("File View", txtData);
	View view = observerFactory_fileView.createObserver().getView();
	
	observerFactory_status = new ObserverFactory("Status", txtData);
	View status = observerFactory_status.createObserver().getView();
	
	observerFactory_btnPanel = new ObserverFactory("btn panel", txtData);
	View btnPanel = observerFactory_btnPanel.createObserver().getView();
	
	
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

