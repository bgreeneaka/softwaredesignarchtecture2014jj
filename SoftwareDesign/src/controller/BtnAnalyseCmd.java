package controller;

import java.io.IOException;

import javax.swing.JButton;

import opennlp.tools.util.InvalidFormatException;
import model.TextData;

public class BtnAnalyseCmd extends JButton implements Command, algorithm {

	private int alg;
	private algorithm algorithm ;
	private TextData txtData;

	public BtnAnalyseCmd(String caption, TextData txtData) {
		// TODO Auto-generated constructor stub
		super(caption);
		this.txtData = txtData;
		
	}
	public void setAlgorithm(algorithm algorithm)
	{
		this.algorithm = algorithm;
	}
	public algorithm getAlgorithm()
	{
		return algorithm;
	}
	public void analyse() throws InvalidFormatException, IOException
	{
		algorithm= this.txtData.getAlgorithm();
		algorithm.doAnalyseAlgoritm();
		
		
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		//algorithm algorithm = (algorithm) txtData.getAlgorithm();
		//algorithm.setAlgorithm(new txtData.getAlgorithmString());
		// will call algorithm
		// for testing

		System.out.println("Analyse Clicked");
		try {
			analyse();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void doAnalyseAlgoritm() throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		
	}

}
