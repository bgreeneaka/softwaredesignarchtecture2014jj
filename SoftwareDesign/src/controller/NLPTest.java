package controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;
import opennlp.tools.util.InvalidFormatException;

public class NLPTest implements algorithm{

	
	public  NLPTest() throws InvalidFormatException,
	IOException {
	String paragraph = "Hi. How are you? This is Mike.";
 
	// always start with a model, a model is learned from training data
	InputStream is = new FileInputStream("C:/Users/bart/git/softwaredesignarchtecture2014jj/SoftwareDesign/en-sent.bin");
	SentenceModel model = new SentenceModel(is);
	SentenceDetectorME sdetector = new SentenceDetectorME(model);
 
	String sentences[] = sdetector.sentDetect(paragraph);
 
	System.out.println(sentences[0]);
	System.out.println(sentences[1]);
	is.close();
	
	
}
	
@Override
public void doAnalyseAlgoritm(){
	
	
}
}


