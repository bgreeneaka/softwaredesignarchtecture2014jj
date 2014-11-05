package model;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import view.Observer;
/*
 * This is the subject, the Observable object
 */
public class TextData implements Subject {
	
	public String str1 ="";
	public String path ="";
	public String algorithm ="";
	public String dbms ="";
	private ArrayList<Observer> observers;
	
	public TextData() {
		// Constructor
		observers = new ArrayList();
	}

	public void setTextData(String str1,String path,String algorithm,String dbms){
		this.str1=str1;
		this.path=path;
		this.algorithm=algorithm;
		this.dbms=dbms;
	}
	
	public void setPath(String path){
		this.path = path;
	}
	@Override
	public void registerObserver(Observer observer) {
		// Add observers to subject
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		// remove observers
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		// notify all observers on update
		for(Observer o: observers){
			o.update(str1,path,algorithm,dbms);
		}	
	}
	
	/*
	 * Add an update listner to all subjects
	 */
	public void addUpdateListner(ActionListener updateListner) {
		for(Observer o: observers){
			o.addActionListener(updateListner);
		}
		
	}
	/*
	 * Method to test the observer update
	 */
	public void editText(String strUpdate){
		//this.str1 = this.str1 + strUpdate;	
		notifyObservers();
	}
	
}
