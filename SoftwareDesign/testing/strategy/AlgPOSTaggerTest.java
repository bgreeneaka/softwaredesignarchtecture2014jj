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

public class AlgPOSTaggerTest {
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
		ps = new  AlgPOSTagger();
		txtData = new TextData();
		txtData.setData("TextDataString1. Text DataString2. Text DataString3. TextData String4. ");
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public final void testAlgPOSTagger()  {
//		//constructor
//	}

	@Test
	public final void testDoAnalyseAlgoritm() throws InvalidFormatException, IOException {
		ps.doAnalyseAlgoritm(txtData);
		assertEquals(
				txtData.getData(),
				"TextDataString1._NNP Text_NNP DataString2._NNP Text_NNP DataString3._NNP TextData_NNP String4._.");
	}

}
