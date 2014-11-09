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
	private TextData txtData;
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
		btn = new BtnProcessCmd("Process", txtData);
		processStrategy = new AlgSentenceDetector();
		
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public final void testBtnProcessCmd() {
//		// Constructor
//	}

	@Test
	public final void testExecute() throws IOException {
		btn.execute();
		assertEquals(txtData.getData(),"");
	}

}
