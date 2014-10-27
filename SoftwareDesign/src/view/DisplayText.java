package view;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DisplayText extends JPanel {

	JPanel panel = new JPanel();

	public DisplayText() {// constructor

		JLabel lbl = new JLabel("DisplayText");
		setBorder(BorderFactory.createLineBorder(Color.black));
		add(lbl);

	}
}
