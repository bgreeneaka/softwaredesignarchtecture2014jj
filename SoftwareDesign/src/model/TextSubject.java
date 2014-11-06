package model;

import controller.Controller.CommandListner;
import controller.Controller.StrategyListner;

public interface TextSubject{
	
	public void addCommandListner(CommandListner commandListner);
	
	public void addStrategyListner(StrategyListner strategyListner);

	public void setAlgorithm(String string);
}
