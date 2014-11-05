package view;

import java.awt.event.ActionListener;

public interface Observer {

	public	void update(String str1,String path,String algorithm,String dbms);

	public void addActionListener(ActionListener updateListner);

}
