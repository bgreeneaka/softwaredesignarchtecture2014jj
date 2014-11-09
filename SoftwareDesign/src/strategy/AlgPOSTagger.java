package strategy;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;

import model.Subject;
import opennlp.tools.cmdline.PerformanceMonitor;
import opennlp.tools.cmdline.postag.POSModelLoader;
import opennlp.tools.postag.POSModel;
import opennlp.tools.postag.POSSample;
import opennlp.tools.postag.POSTaggerME;
import opennlp.tools.tokenize.WhitespaceTokenizer;
import opennlp.tools.util.InvalidFormatException;
import opennlp.tools.util.ObjectStream;
import opennlp.tools.util.PlainTextByLineStream;

public class AlgPOSTagger implements ProcessStrategy {
	public AlgPOSTagger() {

		System.out.println("Running POS Tagger");
	}

	@Override
	public void doAnalyseAlgoritm(Subject txtData)
			throws InvalidFormatException, IOException {
		System.out.println("Running doAnalyseAlgorithm for POS Tagger");
		
		POSModel model = new POSModelLoader()
				.load(new File("C:/Users/Admin/git/SoftwareDesign/en-pos-maxent.bin"));
		PerformanceMonitor perfMon = new PerformanceMonitor(System.err, "sent");
		POSTaggerME tagger = new POSTaggerME(model);

		String input = txtData.getData();;
		ObjectStream<String> lineStream = new PlainTextByLineStream(
				new StringReader(input));

		perfMon.start();
		String line;
		while ((line = lineStream.read()) != null) {

			String whitespaceTokenizerLine[] = WhitespaceTokenizer.INSTANCE
					.tokenize(line);
			String[] tags = tagger.tag(whitespaceTokenizerLine);
			String output ="";
			POSSample sample = new POSSample(whitespaceTokenizerLine, tags);
			System.out.println(sample.toString());
			output += "\n" + sample.toString();
			
			txtData.setData(sample.toString());
			perfMon.incrementCounter();
			
		}
		perfMon.stopAndPrintFinalResult();
		
	}

}
