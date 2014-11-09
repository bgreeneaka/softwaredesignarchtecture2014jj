
import java.awt.BorderLayout;
import java.io.IOException;

import command.BtnCreateDBCmd;
import command.BtnOpenCmd;
import command.BtnProcessCmd;
import command.BtnUpdateCmd;

import opennlp.tools.util.InvalidFormatException;
import controller.Controller;
import factory.ObserverFactory;
import view.ButtonPanel;
import view.DBControlsPanel;
import view.MainUI;
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
	
	
	((ButtonPanel) btnPanel).addBtnCommands(btnOpenFile, btnUpdateView, btnProcess);		
	dbControls.addBtnCommands(btnCreateDB);
	


	MainUI ui = new MainUI();
	ui.add(view,BorderLayout.CENTER);
	ui.add(btnPanel, BorderLayout.LINE_START);
	ui.add(dbControls, BorderLayout.LINE_END);
	
	ui.add(status, BorderLayout.PAGE_END);
	System.out.println("status added to ui");
	
	
	Controller controller  = new Controller(txtData);

	}
	
}

