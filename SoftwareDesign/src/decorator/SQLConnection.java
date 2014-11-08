package decorator;

public class SQLConnection extends DataBaseDecorator {
	
	Database dataBase;
	
	public SQLConnection(Database dataBase) {
		// TODO Auto-generated constructor stub
		this.dataBase = dataBase;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "SQL " + dataBase.description();
	}

}
