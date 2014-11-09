package command;

import java.io.IOException;

import opennlp.tools.util.InvalidFormatException;

public interface Command {
	public void execute() throws InvalidFormatException, IOException;
}
