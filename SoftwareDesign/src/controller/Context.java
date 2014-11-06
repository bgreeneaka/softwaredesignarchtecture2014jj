package controller;

import java.io.IOException;

import opennlp.tools.util.InvalidFormatException;
import model.TextData;

public class Context {

	private ProcessStrategy strategy;

	   public Context(ProcessStrategy strategy) {
	      this.strategy = strategy;
	   }

	   public void executeStrategy(TextData txtData) throws InvalidFormatException, IOException{
		   strategy.process(txtData);
	   }
	
}
