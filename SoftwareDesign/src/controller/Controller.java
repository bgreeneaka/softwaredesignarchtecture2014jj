package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import model.Subject;
import model.TextData;

public class Controller {
	
//	private TextData txtData;
	private HashMap<String, Subject> modelMap;
	//TODO remove this parameter !fileView!
	//private OpenFile fileView; //not needed just here for testing 
	
	public Controller(/*HashMap Map*/) {
		modelMap = new HashMap<String, Subject>();
		
		//addListnersToModels();
		// Constructor
		//this.fileView = fileView;
//		this.txtData = txtData;
//		this.txtData.addUpdateListner(new commandListner()); //Add update listener to the model. DO NOT KNOW IF THE LOGIC IS CORRECT HERE
	}

//	public class UpdateListner implements ActionListener {
//		//Action for when update is pushed
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			txtData.editText(" HAS NOW BEEN UPDATED");//Just for testing to see if update committed
//			//fileView.update(txtData.getString());
//		}
//	}
	
	public void addModel(String Key, Subject subject){
		modelMap.put(Key,subject);
	}
	
	public class commandListner implements ActionListener {
		//Action for when update is pushed
		@Override
		public void actionPerformed(ActionEvent e) {
			Command action = (Command) e.getSource();
			action.execute();
		}
	}
	
	public void addListnersToModels(){
		Iterator it = modelMap.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pairs = (Map.Entry)it.next();
	        System.out.println(pairs.getKey().toString());
	        if(pairs.getKey().equals("textData")){
	        	Object obj = pairs.getValue();
	        	((TextData) obj).addUpdateListner(new commandListner());
	        }
	    }
	}
	
//	public class itemListnerListner implements ItemListener  {
//		//Action when item is selected from combo box
//		@Override
//		public void itemStateChanged(ItemEvent e) {
//			// TODO Auto-generated method stub
//			String str = ((String) e).getSelectedItem(); 
//			
//		}
//	}
}

