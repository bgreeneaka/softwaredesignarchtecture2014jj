package factory;

import javax.swing.JPanel;

import view.ButtonPanel;
import view.Status;
import view.View;
import view.ViewFile;
import model.Subject;
import model.TextData;

;

public class ObserverFactory {
	
	public String type;
	public TextData txtData;
	
	public ObserverFactory(String type, TextData txtData) {
		// TODO Auto-generated constructor stub
		this.type = type;
		this.txtData = txtData;
	}
	public View createObserver(){
		
		if(type.equalsIgnoreCase("File View")){
			return new ViewFile(txtData);
		}
		else if(type.equalsIgnoreCase("Status")){
			return new Status(txtData);
		}
		else if(type.equalsIgnoreCase("btn Panel")){
			return new ButtonPanel(txtData);
		}
		return null;
		
	}
}
