package command;

import static org.junit.Assert.*;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import model.Subject;
import model.TextData;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BtnOpenCmdTest {
	private BtnOpenCmd btn;
	private Subject txtData;
	private Robot r ;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		txtData = new TextData();
		r = new Robot();
		btn = new BtnOpenCmd("",txtData);
			}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public final void testBtnOpenCmd() {
//		//Constructor
//	}

	@Test
	public final void testExecute() {
		btn.execute();
		assertEquals(txtData.getPath(),"C:\\Users\\Bart\\Documents\\b.txt");
	}

}
