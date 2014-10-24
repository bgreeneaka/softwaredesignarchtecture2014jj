package Observer;

import GUI.DisplayText;

public class OpenFile implements Observer, Display {

	public String str1, str2, str3;
	
	public OpenFile() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(String str1, String str2, String str3) {
		// TODO Auto-generated method stub
		this.str1 = str1;
		this.str2 = str2;
		this.str3 = str3;
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		DisplayText dsT = new DisplayText();
		dst
	}

}
