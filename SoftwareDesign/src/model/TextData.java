package model;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import view.Observer;
/*
 * This is the subject, the Observable object
 */
public class TextData implements Subject {
	
	public String str1 ="";
	private ArrayList<Observer> observers;
	private String txtData = "No txt Data loaded";
	private String str;
	
	public TextData() {
		// Constructor
		observers = new ArrayList();
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
			o.update(txtData);
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
		this.str1 = this.str1 + strUpdate;	
		notifyObservers();
	}
	
	public String getTxtData() {
		return txtData;
	}

	public void setTxtData(String txtData) {
		this.txtData = txtData;
	}
}
