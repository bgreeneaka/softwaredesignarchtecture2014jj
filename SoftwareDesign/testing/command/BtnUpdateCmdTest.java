package command;

import static org.junit.Assert.*;
import model.Subject;
import model.TextData;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BtnUpdateCmdTest {

	private BtnUpdateCmd btn;
	private Subject txtData;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		txtData = new TextData();
		btn = new BtnUpdateCmd("",txtData);
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public final void testBtnUpdateCmd() {
//		//Constructor
//	}

	@Test
	public final void testExecute() {
		btn.execute();
		assertEquals(txtData.getData(),"Update hit");
	}

}
