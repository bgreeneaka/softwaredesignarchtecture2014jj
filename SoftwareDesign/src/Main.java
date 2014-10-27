
import controller.Controller;
import controller.FileOpenCommand;
import controller.Invoker;
import view.DisplayGraphics;
import view.DisplayStats;
import view.GUI;
import view.MainUI;
import view.OpenFile;
import model.TextData;


public class Main {
	public static void main(String[] args) {
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
	MainUI uI = new MainUI();
	
	
	
  
     
    //creating command 
    FileOpenCommand openFileCommand = new FileOpenCommand("ABCD123456789");
     
    //Creating invoker 
    Invoker file = new Invoker(openFileCommand);
     
    //perform action on invoker object
    file.execute();
     
   
	
	}
	
}

