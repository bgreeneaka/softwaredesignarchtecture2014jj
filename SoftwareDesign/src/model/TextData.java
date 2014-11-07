package model;

import java.util.ArrayList;

import controller.Controller.CommandListner;
import controller.Controller.StrategyListner;
import view.Observer;
/*
 * This is the subject, the Observable object
 */
public class TextData  implements Subject, TextSubject {
	
	public String data = "";
	public String path ="No File Selected";
	public String algorithm ="";
	public String dbms ="";
	private ArrayList<Observer> observers;
	private int stringCount = 0;
	
	public TextData() {
		// Constructor
		observers = new ArrayList();
	}
	
	public String getData(){
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
		notifyObservers();
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

	public int getStringCount() {
		return stringCount;
	}

	public void setStringCount(int stringCount) {
		this.stringCount = stringCount;
	}

	public String getPath() {
		return path;
	}
	
	public void setPath(String path){
		this.path = path;
	}

	public void setAllTextData(String txtData,String path,String algorithm,String dbms){
		this.data=txtData;
		this.path=path;
		this.algorithm=algorithm;
		this.dbms=dbms;
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
	
	//This should be removed not used in the project!!!!!!!!!!!!!!!!!!!!!!!!!!
	public void txtDataChanged() {
		notifyObservers();
		}
	

	@Override
	public void addCommandListner(CommandListner commandListner) {
		// TODO Auto-generated method stub
		for(Observer o: observers){
			o.addActionListener(commandListner);
		}
	}

	@Override
	public void addStrategyListner(StrategyListner strategyListner) {
		// TODO Auto-generated method stub
		for(Observer o: observers){
			o.addItemListener(strategyListner);
		}
	}

}

