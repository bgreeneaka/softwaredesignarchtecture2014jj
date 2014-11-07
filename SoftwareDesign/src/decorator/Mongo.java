package decorator;

public class Mongo extends DataBaseDecorator {
	
	Database dataBase;
	
	public Mongo(Database dataBase) {
		// TODO Auto-generated constructor stub
		this.dataBase = dataBase;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return  "Mongo" + dataBase.description();
	}

}
