package model;

import java.util.ArrayList;

import controller.Controller.CommandListner;
//import controller.Controller.DatabaseListner;
import controller.Controller.StrategyListner;
//import controller.Controller.StrategyListner;
import decorator.Database;
import strategy.ProcessStrategy;
import view.Observer;
/*
 * This is the subject, the Observable object
 */
public class TextData  implements Subject, TextSubject {
	
	private ProcessStrategy processStrategy;
	private Database dataBase;
	private String data = "";
	private String path ="";
	private String algorithm ="";
	private String dbms ="";
	private ArrayList<Observer> observers;
	private int tokenCount = 0;
	private int sentenceCount = 0;
	

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

	public int getTokenCount() {
		return tokenCount;
	}

	public void setTokenCount(int stringCount) {
		this.tokenCount = stringCount;
		notifyObservers();
	}
	
	public int getSentenceCount() {
		return sentenceCount;
	}

	public void setSentenceCount(int sentenceCount) {
		this.sentenceCount = sentenceCount;
		notifyObservers();
	}

	public String getPath() {
		return path;
	}
	
	public void setPath(String path){
		this.path = path;
		notifyObservers();
	}
	

	public ProcessStrategy getProcessStrategy() {
		return processStrategy;
	}

	public void setProcessStrategy(ProcessStrategy processStrategy) {
		this.processStrategy = processStrategy;
		notifyObservers();
	}
	
	@Override
	public Database getDatabase() {
		// TODO Auto-generated method stub
		return dataBase;
	}

	@Override
	public void setDataBase(Database dataBase) {
		// TODO Auto-generated method stub
		this.dataBase = dataBase;
		setDbms(dataBase.description());
		notifyObservers();
	}


	public void setAllTextData(String txtData,String path,String algorithm,String dbms){
		this.data=txtData;
		this.path=path;
		this.algorithm=algorithm;
		this.dbms=this.dataBase.description();
		notifyObservers();
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
			o.update();
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

