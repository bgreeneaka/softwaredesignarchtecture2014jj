package controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;
import opennlp.tools.util.InvalidFormatException;
import model.TextData;

public  class SentenceDetectionStrategy implements ProcessStrategy {
	
	//private ProcessAlgorithm processAlgorithm;
	private TextData txtData;
	
	public SentenceDetectionStrategy(TextData txtData) {
		// TODO Auto-generated constructor stub
		this.txtData = txtData;
	}
	

	@Override
	public void process() throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		
		String text = this.txtData.getTxtData();
		
		InputStream is = new FileInputStream("C:/Users/bart/git/softwaredesignarchtecture2014jj/SoftwareDesign/en-sent.bin");
		SentenceModel model = new SentenceModel(is);
		SentenceDetectorME sdetector = new SentenceDetectorME(model);
	 
		String sentences[] = sdetector.sentDetect(text);
	 
		System.out.println(sentences[0]);
		System.out.println(sentences[1]);
		String str = "";
		for(int i = 0; i < sentences.length; i++){
			str = "\n" + sentences[i];
		}
		
		is.close();
//		this.txtData.setTextData(str, "path", "algorithm", "dbms");
//		this.txtData.notifyObservers();
	}

}
