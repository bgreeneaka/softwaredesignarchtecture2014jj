package controller;

import java.io.IOException;

import opennlp.tools.util.InvalidFormatException;

public interface ProcessStrategy {
	public void process() throws InvalidFormatException, IOException;
}
