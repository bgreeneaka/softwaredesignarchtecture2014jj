package controller;

import static org.junit.Assert.*;
import model.Subject;
import model.TextData;
import model.TextSubject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import strategy.ProcessStrategy;

public class ControllerTest {
	Controller ctrl;
	private TextSubject txtData;
	private ProcessStrategy ps;
	private String alg;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		txtData = new TextData();
		alg="";
		ctrl = new Controller(txtData);
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public final void testController() {
//		fail("Not yet implemented"); // TODO
//	}

	@Test
	public final void testSelectAlgSentenceDetector() {
		ctrl.setAlg("Sentence Detector");
		ctrl.selectAlgorithm();
		assertEquals(txtData.getAlgorithm(), "Sentence Detector");
	}
	@Test
	public final void testSelectAlgTokenizer() {
		ctrl.setAlg("Tokenizer");
		ctrl.selectAlgorithm();
		assertEquals(txtData.getAlgorithm(), "Tokenizer");
		//assertEquals(txtData.getProcessStrategy(), new AlgTokenizer());
	}
	@Test
	public final void testSelectAlgParser() {
		ctrl.setAlg("Parser");
		ctrl.selectAlgorithm();
		assertEquals(txtData.getAlgorithm(), "Parser");
	}
	@Test
	public final void testSelectAlgPOSTagger() {
		ctrl.setAlg("POS Tagger");
		ctrl.selectAlgorithm();
		assertEquals(txtData.getAlgorithm(), "POS Tagger");
	}
	@Test
	public final void testSelectAlgChunker() {
		ctrl.setAlg("Chunker");
		ctrl.selectAlgorithm();
		assertEquals(txtData.getAlgorithm(), "Chunker");
	}

}
