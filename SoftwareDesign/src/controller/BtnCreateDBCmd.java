package controller;

import java.io.IOException;

import javax.swing.JButton;

import decorator.Database;
import decorator.MongoConnection;
import decorator.OracleConnection;
import decorator.SQLConnection;
import model.Subject;
import opennlp.tools.util.InvalidFormatException;

public class BtnCreateDBCmd extends JButton implements Command {
	
	private Subject txtData;
	
	public BtnCreateDBCmd(String caption,Subject txtData) {
		// TODO Auto-generated constructor stub
		super(caption);
		this.txtData = txtData;
	}

	@Override
	public void execute() throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		String selectedDataBase = txtData.getDbms();
		Database database = new Database();
		
		switch(selectedDataBase)
		{
		case "Oracle":
			txtData.setDbms(new OracleConnection(database).description());
			break;
		case "SQL":
			txtData.setDbms(new SQLConnection(database).description());
			break;
		case "Mongo":
			txtData.setDbms(new MongoConnection(database).description());
			break;
		default :
			System.out.println("No db created");
		}
	}

}
