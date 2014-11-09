package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;




import strategy.AlgChunker;
import strategy.ProcessStrategy;
import decorator.Database;

public class TextDataTest {

	private TextData txtData;
	private ProcessStrategy processStrategy;
	private Database dataBase;

	// Result r = JUnitCore.

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

		txtData = new TextData();
		dataBase = new Database();
		processStrategy = new AlgChunker();
		txtData.setAllTextData("TextDataString1. Text DataString2. Text DataString3. TextData String4. ", "PathString",
				"AlgorithmString", "DBMSString");
		txtData.setDataBase(dataBase);
		txtData.setProcessStrategy(processStrategy);
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public final void testTextData() {
//		// Construtor
//	}

	@Test
	public final void testGetData() {
		assertEquals(txtData.getData(), "TextDataString1. Text DataString2. Text DataString3. TextData String4. ");
	}

//	@Test
//	public final void testSetData() {
//		// set
//
//	}

	@Test
	public final void testGetAlgorithm() {
		assertEquals(txtData.getAlgorithm(), "AlgorithmString");
	}

//	@Test
//	public final void testSetAlgorithm() {
//		// set
//	}

	@Test
	public final void testGetDbms() {
		assertEquals(txtData.getDbms(), "Database");
	}

//	@Test
//	public final void testSetDbms() {
//		// set
//	}

	@Test
	public final void testGetTokenCount() {

	}

//	@Test
//	public final void testSetTokenCount() {
//		// set
//	}

	@Test
	public final void testGetSentenceCount() {

	}

//	@Test
//	public final void testSetSentenceCount() {
//		// set
//	}

	@Test
	public final void testGetPath() {
		assertEquals(txtData.getPath(), "PathString");
	}

//	@Test
//	public final void testSetPath() {
//		// set
//	}

	@Test
	public final void testGetProcessStrategy() {
		assertEquals(txtData.getProcessStrategy(), processStrategy);
	}

//	@Test
//	public final void testSetProcessStrategy() {
//		// set
//	}

	@Test
	public final void testGetDatabase() {
		assertEquals(txtData.getDatabase(), dataBase);
	}

//	@Test
//	public final void testSetDataBase() {
//		// set
//	}

//	@Test
//	public final void testSetAllTextData() {
//		// set
//	}

//	@Test
//	public final void testRegisterObserver() {
//
//	}
//
//	@Test
//	public final void testRemoveObserver() {
//
//	}
//
//	@Test
//	public final void testNotifyObservers() {
////
//	}
//
//	@Test
//	public final void testTxtDataChanged() {
//
//	}
//
//	@Test
//	public final void testAddCommandListner() {
//
//	}
//
//	@Test
//	public final void testAddStrategyListner() {
//
//	}

}
