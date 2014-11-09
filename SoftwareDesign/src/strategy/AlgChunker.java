package strategy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;

import model.Subject;
import model.TextData;
import opennlp.tools.chunker.ChunkerME;
import opennlp.tools.chunker.ChunkerModel;
import opennlp.tools.cmdline.PerformanceMonitor;
import opennlp.tools.cmdline.postag.POSModelLoader;
import opennlp.tools.postag.POSModel;
import opennlp.tools.postag.POSSample;
import opennlp.tools.postag.POSTaggerME;
import opennlp.tools.tokenize.WhitespaceTokenizer;
import opennlp.tools.util.InvalidFormatException;
import opennlp.tools.util.ObjectStream;
import opennlp.tools.util.PlainTextByLineStream;
import opennlp.tools.util.Span;

public class AlgChunker implements ProcessStrategy {
	public AlgChunker() {
		System.out.println("Running Chunker");
	}

	@Override
	public void doAnalyseAlgoritm(TextData txtData)
			throws InvalidFormatException, IOException {
		System.out.println("Running doAnalyseAlgorithm for Chunker");
		// TODO Auto-generated method stub

		POSModel model = new POSModelLoader()
				.load(new File("C:/Users/Admin/git/SoftwareDesign/en-pos-maxent.bin"));
		PerformanceMonitor perfMon = new PerformanceMonitor(System.err, "sent");
		POSTaggerME tagger = new POSTaggerME(model);

		String input = txtData.getData();
		ObjectStream<String> lineStream = new PlainTextByLineStream(
				new StringReader(input));

		perfMon.start();
		String line;
		String whitespaceTokenizerLine[] = null;

		String[] tags = null;
		while ((line = lineStream.read()) != null) {
			whitespaceTokenizerLine = WhitespaceTokenizer.INSTANCE
					.tokenize(line);
			tags = tagger.tag(whitespaceTokenizerLine);

			POSSample sample = new POSSample(whitespaceTokenizerLine, tags);
			System.out.println(sample.toString());
			perfMon.incrementCounter();
		}
		perfMon.stopAndPrintFinalResult();

		// chunker
		InputStream is = new FileInputStream("C:/Users/Admin/git/SoftwareDesign/en-chunker.bin");
		ChunkerModel cModel = new ChunkerModel(is);

		ChunkerME chunkerME = new ChunkerME(cModel);
		String result[] = chunkerME.chunk(whitespaceTokenizerLine, tags);
		String output ="";
		
		for (String s : result){
			System.out.println(s);
			output += "\n" + s.toString();
		}
		Span[] span = chunkerME.chunkAsSpans(whitespaceTokenizerLine, tags);
		for (Span s : span){
			System.out.println(s.toString());
//			output += "\n" + s.toString();
		}
		
		txtData.setData(output);
	}

}
