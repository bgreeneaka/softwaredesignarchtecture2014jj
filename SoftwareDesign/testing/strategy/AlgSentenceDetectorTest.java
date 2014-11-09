package strategy;

import static org.junit.Assert.*;

import java.io.IOException;

import model.Subject;
import model.TextData;
import opennlp.tools.util.InvalidFormatException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AlgSentenceDetectorTest {
	private TextData txtData;
	private ProcessStrategy ps;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		ps = new  AlgSentenceDetector();
		txtData = new TextData();
		txtData.setData("TextDataString1. Text DataString2. Text DataString3. TextData String4. ");
		}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public final void testAlgSentenceDetector() {
//	//constructor		
//	}

	@Test
	public final void testDoAnalyseAlgoritm() throws InvalidFormatException, IOException {
		ps.doAnalyseAlgoritm(txtData);
		assertEquals(
				txtData.getData(),
				"\nTextDataString1.\nText DataString2.\nText DataString3.\nTextData String4.");
		assertEquals(txtData.getSentenceCount(), 4);
	}

}
