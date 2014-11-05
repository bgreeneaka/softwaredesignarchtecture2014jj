package view;

import javax.swing.JPanel;

;

public class ObserverFactory {
	
	public String type;
	
	public ObserverFactory(String type) {
		// TODO Auto-generated constructor stub
		this.type = type;
	}
	public View createObserver(){
		if(type.equalsIgnoreCase("File View")){
			return new ViewFile();
		}/*else if(type.equalsIgnoreCase("Results View")){
			return new ResultsView();
		}*/
		return null;
		
	}
}
