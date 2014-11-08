package model;

import controller.AlgSentenceDetector;
//import controller.Controller.DatabaseListner;
import controller.ProcessStrategy;
import controller.Controller.CommandListner;
import controller.Controller.StrategyListner;
import decorator.Database;

public interface TextSubject{
	
	public void addCommandListner(CommandListner commandListner);
	
	public void addStrategyListner(StrategyListner strategyListner);

	public void setAlgorithm(String string);
	
	public void setProcessStrategy(ProcessStrategy processStrategy);
	
	public ProcessStrategy getProcessStrategy();
	
	public void setDbms(String dbms);

	public Database getDatabase();
	
	public void setDataBase(Database dataBase);
}
