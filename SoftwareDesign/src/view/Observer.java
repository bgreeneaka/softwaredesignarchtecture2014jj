package view;

import java.awt.event.ActionListener;

public interface Observer {

	public	void update(String str1);

	public void addActionListener(ActionListener updateListner);

}
