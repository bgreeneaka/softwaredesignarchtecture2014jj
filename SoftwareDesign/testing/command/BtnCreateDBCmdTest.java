
package command;

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

import decorator.Database;
import decorator.OracleConnection;

public class BtnCreateDBCmdTest {
	private BtnCreateDBCmd btn;
	private TextData txtData;
	private String selectedDataBase;
	private Database database;
	private OracleConnection Oracledatabase;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		txtData = new TextData();
		btn = new BtnCreateDBCmd("", txtData);
		selectedDataBase = "Oracle";
		txtData.setDbms("Oracle");
	}

	@After
	public void tearDown() throws Exception {
	}

	// @Test
	// public final void testBtnCreateDBCmd() {
	// // Constructor
	// }

	@Test
	public final void testExecuteOracle() {
		try {
			btn.execute();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals("Oracle Database", txtData.getDatabase().description());

	}
	@Test
	public final void testExecuteSQL() {
		txtData.setDbms("SQL");
		try {
			btn.execute();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals("SQL Database", txtData.getDatabase().description());
	}
	@Test
	public final void testExecuteMongo() {
		txtData.setDbms("Mongo");
		try {
			btn.execute();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals("Mongo Database", txtData.getDatabase().description());
	}
	
	
}
