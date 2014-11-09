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

public class AlgTokenizerTest {
	private Subject txtData;
	private ProcessStrategy ps;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		ps = new AlgTokenizer();
		txtData = new TextData();
		txtData.setData("TextDataString1. Text DataString2. Text DataString3. TextData String4. ");
	}
	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public final void testAlgTokenizer() {
//		//Constructor
//	}

	@Test
	public final void testDoAnalyseAlgoritm() throws InvalidFormatException, IOException {
		ps.doAnalyseAlgoritm(txtData);
		assertEquals(
				txtData.getData(),
				"\nTextDataString1\n.\nText\nDataString2\n.\nText\nDataString3\n.\nTextData\nString4\n.");
		assertEquals(txtData.getTokenCount(), 11);
	}

}
