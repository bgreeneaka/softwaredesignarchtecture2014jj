package strategy;

import java.io.IOException;

import model.Subject;
import model.TextData;
import opennlp.tools.util.InvalidFormatException;

public interface ProcessStrategy  {
	//public void process(Subject txtData) throws InvalidFormatException, IOException;
	
	public void doAnalyseAlgoritm(Subject txtData) throws InvalidFormatException, IOException;
}