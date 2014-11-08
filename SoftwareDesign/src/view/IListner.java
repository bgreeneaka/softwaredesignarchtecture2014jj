package view;

import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

public abstract class IListner {
	
	abstract public void addCommandListner(ActionListener commandListner);
	
	abstract public void addItemListener(ItemListener itemListener);
	
}
