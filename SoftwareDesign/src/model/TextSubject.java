package model;

import controller.AlgSentenceDetector;
import controller.ProcessStrategy;
import controller.Controller.CommandListner;
import controller.Controller.StrategyListner;

public interface TextSubject{
	
	public void addCommandListner(CommandListner commandListner);
	
	public void addStrategyListner(StrategyListner strategyListner);

	public void setAlgorithm(String string);
	
	public void setProcessStrategy(ProcessStrategy processStrategy);
	
	public ProcessStrategy getProcessStrategy();
}
