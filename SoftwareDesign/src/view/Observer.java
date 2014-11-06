package view;

import java.awt.event.ActionListener;

public interface Observer {

	public	void update(String txtData,String path,String algorithm,String dbms);

	public void addActionListener(ActionListener updateListner);

}
