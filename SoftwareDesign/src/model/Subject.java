package model;

import controller.Controller.CommandListner;
import controller.Controller.StrategyListner;
import decorator.Database;
import strategy.AlgSentenceDetector;
import strategy.ProcessStrategy;
import view.Observer;

public interface Subject {
	public void registerObserver(Observer observer);
	
	public void removeObserver(Observer observer);
	
	public void notifyObservers();
	
	
	
	
}
