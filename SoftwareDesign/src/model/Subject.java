package model;

import controller.Controller.CommandListner;
import controller.Controller.StrategyListner;
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
	
}
