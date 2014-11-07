package decorator;

public class Oracle extends DataBaseDecorator {
	
	Database dataBase;
	
	public Oracle(Database dataBase) {
		// TODO Auto-generated constructor stub
		this.dataBase = dataBase;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "Oracle" + dataBase.description();
	}

}
