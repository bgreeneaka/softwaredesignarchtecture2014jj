package controller;

import java.io.IOException;

import model.Subject;
import opennlp.tools.util.InvalidFormatException;



public class AlgPOSTagger  implements ProcessStrategy{
	public AlgPOSTagger(){
		
		System.out.println("Running POS Tagger");
	}
	@Override
	public void doAnalyseAlgoritm(Subject txtData) throws InvalidFormatException, IOException {
		System.out.println("Running doAnalyseAlgorithm for POS Tagger");
		// TODO Auto-generated method stub
		
	}

}
