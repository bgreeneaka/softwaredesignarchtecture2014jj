
import java.io.IOException;

import opennlp.tools.util.InvalidFormatException;
import controller.Controller;
import controller.FileOpenCommand;
import controller.NLPTest;
import view.BaseFrame;
import view.DisplayGraphics;
import view.DisplayStats;
import view.GUI;
import view.MainUI;
import view.PanelWithOpenBtn;
import view.ViewFile;
import model.TextData;


public class Main {
	public static void main(String[] args) throws InvalidFormatException, IOException {
	// TODO Auto-generated method stub
	System.out.println("Test");	


//	TextData txtData = new TextData(); // (Model) Create new subject/ model which holds all data 
//	System.out.println("Txt Data Created");	//FOR TESTING
//	OpenFile displayFile = new OpenFile(); // (View) Create new view/observer to display data from model/subject
//	System.out.println("Open File created"); //FOR TESTING
//	txtData.registerObserver(displayFile);  //register observer with subject
//	System.out.println("Open File registered"); //FOR TESTING
//	Controller controller  = new Controller(txtData); //Create new controller and add the model to it
//	displayFile.setVisible(true); 
//	MainUI uI = new MainUI();
//	TextData txtData = new TextData();
 //ViewFile viewFile = new ViewFile();
//	txtData.registerObserver(uI);
//	txtData.registerObserver(viewFile);
	MainUI ui = new MainUI();
	
	}
	
}

