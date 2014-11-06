package controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import model.Subject;
import opennlp.tools.tokenize.Tokenizer;
import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;
import opennlp.tools.util.InvalidFormatException;

public class Tokenize implements ProcessStrategy {

	public Tokenize() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process(Subject txtData) throws InvalidFormatException,
			IOException {
		InputStream is = new FileInputStream("C:/Users/Admin/git/SoftwareDesign/en-token.bin");
		 
		TokenizerModel model = new TokenizerModel(is);
	 
		Tokenizer tokenizer = new TokenizerME(model);
	 
		String tokens[] = tokenizer.tokenize(txtData.getData());
		
		String output ="";
		
		for (String a : tokens){
			System.out.println(a);
			output += "\n" + a;
		}
		
		is.close();
		txtData.setData(output);
		
	}

}
