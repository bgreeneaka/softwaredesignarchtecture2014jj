package controller;

import java.io.IOException;

import opennlp.tools.util.InvalidFormatException;
import model.TextData;

public class Contex {
	public ProcessStrategy strategy;
	
	public  Contex(ProcessStrategy strategy) {
		 this.strategy = strategy;
	}

	public void executeStrategy(TextData txtData) throws InvalidFormatException, IOException{
		   strategy.process(txtData);
	 }
}
