package decorator;

public class OracleConnection extends DataBaseDecorator {
	
	Database dataBase;
	
	public OracleConnection(Database dataBase) {
		// TODO Auto-generated constructor stub
		this.dataBase = dataBase;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "Oracle " + dataBase.description();
	}

}
