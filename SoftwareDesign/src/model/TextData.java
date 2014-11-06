package model;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import view.Observer;
/*
 * This is the subject, the Observable object
 */
public class TextData implements Subject {
	
	public String data = "";
	public String path ="";
	public String algorithm ="";
	public String dbms ="";
	private ArrayList<Observer> observers;
	
	public TextData() {
		// Constructor
		observers = new ArrayList();
	}
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}

	public String getDbms() {
		return dbms;
	}

	public void setDbms(String dbms) {
		this.dbms = dbms;
	}

	public String getPath() {
		return path;
	}
	public void setTextData(String txtData,String path,String algorithm,String dbms){
		this.data=txtData;
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
		// remove observer
		int i = observers.indexOf(observer);
		if (i >= 0) {
		observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		// notify all observers on update
		for(Observer o: observers){
			o.update(data,path,algorithm,dbms);
		}	
	}
	
	public void txtDataChanged() {
		notifyObservers();
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
	
	public String getTxtData(){
		return data;
	}
}

