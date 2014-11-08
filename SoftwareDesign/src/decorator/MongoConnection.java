package decorator;

public class MongoConnection extends DataBaseDecorator {
	
	Database dataBase;
	
	public MongoConnection(Database dataBase) {
		// TODO Auto-generated constructor stub
		this.dataBase = dataBase;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return  "Mongo " + dataBase.description();
	}

}
