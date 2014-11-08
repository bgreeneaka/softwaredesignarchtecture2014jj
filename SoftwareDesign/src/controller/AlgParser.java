package controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import model.Subject;
import opennlp.tools.cmdline.parser.ParserTool;
import opennlp.tools.parser.Parse;
import opennlp.tools.parser.Parser;
import opennlp.tools.parser.ParserFactory;
import opennlp.tools.parser.ParserModel;
import opennlp.tools.util.InvalidFormatException;


public class AlgParser  implements ProcessStrategy {
	
	public AlgParser(){
	System.out.println("Running Name Finder");
}

	@Override
	public void doAnalyseAlgoritm(Subject txtData) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Running doAnalyseAlgorithm for Name Finder");
		
		InputStream is = new FileInputStream("C:/Users/Admin/git/SoftwareDesign/en-parser-chunking.bin");
		 
		ParserModel model = new ParserModel(is);
	 
		Parser parser = ParserFactory.create(model);
	 
		String sentence = txtData.getData();
		Parse topParses[] = ParserTool.parseLine(sentence, parser, 1);
		
		String output  = "";
		
		for (Parse p : topParses){
			p.show();
			output = "\n" + p.toString();
		}
		txtData.setData(output);
		is.close();
	}
}
