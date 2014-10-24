package Observer;

import java.util.ArrayList;

public class TextData implements Subject {
	
	public String str1, str2, str3;
	private ArrayList<Observer> observers;
	
	public TextData() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void registerObserver(Observer observer) {
		// Add observers to subject
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		// remove observers
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		// notify all observers on update
		for(Observer o: observers){
			o.update(str1, str2, str3);
		}
		
	}
	
	/*
	 * Method to test the observer update
	 */
	public void editText(String str1, String str2, String str3){
		this.str1 = str1;
		this.str2 = str2;
		this.str3 = str3;
		
	}

}
