package main;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

// specify a runner class: Suite.class
@RunWith(Suite.class)
// specify an array of test classes
@Suite.SuiteClasses({ command.BtnCreateDBCmdTest.class,
		command.BtnOpenCmdTest.class, command.BtnProcessCmdTest.class,
		command.BtnUpdateCmdTest.class, controller.ControllerTest.class,
		strategy.AlgChunkerTest.class, strategy.AlgParserTest.class,
		strategy.AlgTokenizerTest.class, strategy.AlgPOSTaggerTest.class,
		strategy.AlgSentenceDetectorTest.class, model.TextDataTest.class,
		factory.ObserverFactoryTest.class

})
// the actual class is empty
public class TestRunner {
	;
}
