package controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import model.Subject;
import opennlp.tools.sentdetect.SentenceDetectorME;
import opennlp.tools.sentdetect.SentenceModel;
import opennlp.tools.util.InvalidFormatException;

public class AlgSentenceDetector implements ProcessStrategy {

	public AlgSentenceDetector() {
		System.out.println("Running Sentence Detector");

	}

	@Override
	public void doAnalyseAlgoritm(Subject txtData)
			throws InvalidFormatException, IOException {
		System.out.println("Running doAnalyseAlgorithm for Sentence Detector");
		String str = txtData.getData();

		InputStream is = new FileInputStream(
				"C:/Users/Admin/git/SoftwareDesign/en-sent.bin");
		SentenceModel model = new SentenceModel(is);
		SentenceDetectorME sdetector = new SentenceDetectorME(model);

		String sentences[] = sdetector.sentDetect(str);

		System.out.println(sentences[0]);
		System.out.println(sentences[1]);
		String updateString = "";
		int count = 0;
		
		for (int i = 0; i < sentences.length; i++) {
			updateString += "\n" + sentences[i];
			count++;
		}
		is.close();
		txtData.setData(updateString);
		txtData.setSentenceCount(count); 
	}
}
