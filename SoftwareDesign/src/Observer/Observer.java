package Observer;

import java.awt.event.ActionListener;

public interface Observer {

	void update(String str1);

	void addActionListener(ActionListener updateListner);

}
