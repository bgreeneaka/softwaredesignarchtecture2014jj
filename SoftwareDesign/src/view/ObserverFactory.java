package view;

import javax.swing.JPanel;

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
		}/*else if(type.equalsIgnoreCase("Results View")){
			return new ResultsView();
		}*/
		return null;
		
	}
}
