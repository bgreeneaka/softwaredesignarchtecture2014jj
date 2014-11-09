package command;

import static org.junit.Assert.*;

import java.io.IOException;

import model.Subject;
import model.TextData;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import strategy.AlgSentenceDetector;
import strategy.ProcessStrategy;

public class BtnProcessCmdTest {
	private Subject txtData;
	private BtnProcessCmd btn;
	private ProcessStrategy processStrategy;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

	}

	@Before
	public void setUp() throws Exception {
		txtData = new TextData();
		txtData.setData("TextDataString1. Text DataString2. Text DataString3. TextData String4. ");
		btn = new BtnProcessCmd("Process", txtData);
		processStrategy = new AlgSentenceDetector();
		txtData.setProcessStrategy(processStrategy);
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public final void testBtnProcessCmd() {
//		// Constructor
//	}

	@Test
	public final void testExecute() {
		try {
			btn.execute();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(
				txtData.getData(),
				"\nTextDataString1.\nText DataString2.\nText DataString3.\nTextData String4.");
	}

}
