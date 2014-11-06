package controller;

import java.io.IOException;

import model.TextData;
import opennlp.tools.util.InvalidFormatException;

public interface ProcessStrategy {
	public void process(TextData txtData) throws InvalidFormatException, IOException;
}
