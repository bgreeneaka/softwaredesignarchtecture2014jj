package command;

import java.io.IOException;

import javax.swing.JButton;

import decorator.Database;
import decorator.MongoConnection;
import decorator.OracleConnection;
import decorator.SQLConnection;
import model.Subject;
import model.TextData;
import opennlp.tools.util.InvalidFormatException;

public class BtnCreateDBCmd extends JButton implements Command {
	
	private TextData txtData;
	
	public BtnCreateDBCmd(String caption,TextData txtData) {
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
			txtData.setDataBase(new OracleConnection(database));
			break;
		case "SQL":
			txtData.setDataBase(new SQLConnection(database));
			break;
		case "Mongo":
			txtData.setDataBase(new MongoConnection(database));
			break;
		default :
			System.out.println("No db created");
		}
	}

}
