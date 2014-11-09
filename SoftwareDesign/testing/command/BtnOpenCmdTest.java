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
	private Robot robot;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		txtData = new TextData();
		btn = new BtnOpenCmd("",txtData);
		robot = new Robot();
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
		System.out.println("No db created");
		//btn.execute();
		robot.mouseMove(500,500);
		robot.setAutoDelay(5000);
		
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_SPACE);
	}

}
