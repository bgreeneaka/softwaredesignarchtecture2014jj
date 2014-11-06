package controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;
import opennlp.tools.util.InvalidFormatException;
import model.TextData;

public  class SentenceDetectionStrategy implements ProcessStrategy {

	public SentenceDetectionStrategy() {
		// TODO Auto-generated constructor stub
	}
	
	//needs some work but logic is correct and working
	@Override
	public void process(TextData txtData) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		
		String str = txtData.getData();
		
		InputStream is = new FileInputStream("C:/Users/Admin/git/SoftwareDesign/en-sent.bin");
		SentenceModel model = new SentenceModel(is);
		SentenceDetectorME sdetector = new SentenceDetectorME(model);
	 
		String sentences[] = sdetector.sentDetect(str);
	 
		System.out.println(sentences[0]);
		System.out.println(sentences[1]);
		String updateString = "";
		for(int i = 0; i < sentences.length; i++){
			updateString += "\n" + sentences[i];
		}		
		is.close();
		txtData.setData(updateString);
	}

}
