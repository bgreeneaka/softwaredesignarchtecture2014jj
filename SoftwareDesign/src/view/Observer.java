package view;

import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

public interface Observer  {

	public	void update();

	public void addActionListener(ActionListener commandListner);
	
	public void addItemListener(ItemListener itemListener);

}
