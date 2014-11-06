package controller;

import java.io.IOException;

import opennlp.tools.util.InvalidFormatException;
import model.Subject;
import model.TextData;

public class Contex {
	public ProcessStrategy strategy;
	
	public  Contex(ProcessStrategy strategy) {
		 this.strategy = strategy;
	}

	public void executeStrategy(Subject txtData) throws InvalidFormatException, IOException{
		   strategy.process(txtData);
	 }
}
