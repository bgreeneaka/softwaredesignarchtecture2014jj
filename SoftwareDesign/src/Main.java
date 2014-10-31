
import java.io.IOException;
import javax.swing.JButton;
import opennlp.tools.util.InvalidFormatException;
import controller.BtnOpenCmd;
import controller.BtnUpdateCmd;
import controller.Controller;
import controller.FileOpenCommand;
import controller.NLPTest;
import view.BaseFrame;
import view.DisplayStats;
import view.MainUI;
import view.PanelWithOpenBtn;
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
	JButton btnAlg1 = new JButton("Alg 1");
	JButton btnAlg2 = new JButton("Alg 2");
	MainUI ui = new MainUI(viewFile,btnOpenFile,btnUpdateView,btnAlg1, btnAlg2);
	txtData.registerObserver(ui);
	txtData.registerObserver(viewFile);
	Controller controller  = new Controller(txtData);
	
	
	}
	
}

