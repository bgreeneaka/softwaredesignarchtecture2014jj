package model;

import controller.AlgSentenceDetector;
import controller.ProcessStrategy;
import controller.Controller.CommandListner;
import controller.Controller.StrategyListner;
import decorator.Database;
import view.Observer;

public interface Subject {
	public void registerObserver(Observer observer);
	
	public void removeObserver(Observer observer);
	
	public void notifyObservers();
	
	public String getData();
	
	public void setPath(String string);
	
	public void setData(String string);
	
	public String getAlgorithm();
	
	public void setAlgorithm(String string);
	
	public String getDbms();
	
	public void setDbms(String dbms);
	
	public String getPath();
	
	public void setProcessStrategy(ProcessStrategy processStrategy);
	
	public ProcessStrategy getProcessStrategy();
	
	public Database getDatabase();
	
	public void setDataBase(Database dataBase);
	
	public int getSentenceCount();
	
	public void setSentenceCount(int sentenceCount);
	
	public int getTokenCount();
	
	public void setTokenCount(int stringCount);
	
	
}
