package controller;

import java.io.IOException;

import model.Subject;
import opennlp.tools.util.InvalidFormatException;

public class AlgNameFinder  implements ProcessStrategy {
	
	public AlgNameFinder(){
	System.out.println("Running Name Finder");
}

	@Override
	public void doAnalyseAlgoritm(Subject txtData) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Running doAnalyseAlgorithm for Name Finder");
	}
}
