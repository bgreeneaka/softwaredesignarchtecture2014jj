import GUI.GUI;
import Observer.Controller;
import Observer.DisplayStats;
import Observer.OpenFile;
import Observer.TextData;


public class Main {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("Test");	
//	new GUI();
//	DisplayStats stats = new DisplayStats();
//	
	TextData txtData = new TextData(); // //Model
	System.out.println("Txt Data Created");	
	OpenFile displayFile = new OpenFile(); // view
	System.out.println("Open File created");
	txtData.registerObserver(displayFile);
	System.out.println("Open File registered");
	Controller controller  = new Controller(txtData);
	displayFile.setVisible(true);
	
	
	
	}
	
}

