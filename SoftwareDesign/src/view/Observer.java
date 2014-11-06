package view;

import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

public interface Observer {

	public	void update(String txtData,String path,String algorithm,String dbms);

	public void addActionListener(ActionListener updateListner);
	
	public void addItemListener(ItemListener itemListener);

}
