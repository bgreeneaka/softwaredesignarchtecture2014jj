package strategy;

import java.io.IOException;

import model.Subject;
import model.TextData;
import opennlp.tools.util.InvalidFormatException;

public interface ProcessStrategy  {
	
	public void doAnalyseAlgoritm(TextData txtData) throws InvalidFormatException, IOException;
}
