
import java.awt.BorderLayout;
import java.io.IOException;
import opennlp.tools.util.InvalidFormatException;
import controller.BtnProcessCmd;
import controller.BtnOpenCmd;
import controller.BtnUpdateCmd;
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
	
	ObserverFactory observerFactory = new ObserverFactory("File View", txtData);
	View view = observerFactory.createObserver().getView();

	String[] algoritmsCollection= {"alg1", "alg2","alg3"};

	BtnUpdateCmd btnUpdateView = new BtnUpdateCmd("Update View", txtData);
	BtnOpenCmd btnOpenFile = new BtnOpenCmd("Open File",view,txtData);
	BtnProcessCmd btnProcess = new BtnProcessCmd("Process", txtData);

	ButtonPanel btnPanel = new ButtonPanel(txtData);
	btnPanel.addBtnCommands(btnOpenFile, btnUpdateView, btnProcess);
	
	DBControlsPanel dbControls = new DBControlsPanel();

	MainUI ui = new MainUI(txtData);
	ui.add(view,BorderLayout.CENTER);
	ui.add(btnPanel, BorderLayout.LINE_START);
	ui.add(dbControls, BorderLayout.LINE_END);
	
	Controller controller  = new Controller(txtData);

	}
	
}

