package controller;

import java.io.IOException;





import model.Subject;
import opennlp.tools.util.InvalidFormatException;

public class AlgTokenizer  implements ProcessStrategy {

	
	public AlgTokenizer() {
		System.out.println("Running Tokenizer");
	}

	@Override
	public void doAnalyseAlgoritm(Subject txtData) throws InvalidFormatException, IOException {
		System.out.println("Running doAnalyseAlgorithm for Tokenizer");
		
		
	}
}
