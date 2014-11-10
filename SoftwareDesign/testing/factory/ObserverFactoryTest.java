package factory;

import static org.junit.Assert.*;
import model.Subject;
import model.TextData;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import view.ButtonPanel;
import view.Status;
import view.ViewFile;

public class ObserverFactoryTest {
	// private String type;
	private TextData txtData;
	private ObserverFactory OF;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

		txtData = new TextData();

	}

	@After
	public void tearDown() throws Exception {
	}

	// @Test
	// public final void testObserverFactory() {
	// fail("Not yet implemented"); // TODO
	// }

	@Test
	public final void testCreateObserverFileView() {
		OF = new ObserverFactory("File View", txtData);
		assertNotNull(OF.createObserver());
	}

	@Test
	public final void testCreateObserverStatus() {
		OF = new ObserverFactory("Status",  txtData);
		assertNotNull(OF.createObserver());
	}

	@Test
	public final void testCreateObserverBtnPanel() {
		OF = new ObserverFactory("btn Panel", txtData);
		assertNotNull(OF.createObserver());
	}

	@Test
	public final void testCreateObserverInvalid() {
		OF = new ObserverFactory("invalid name", txtData);
		assertNull(OF.createObserver());
	}
}
