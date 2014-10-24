package GUI;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DisplayGraphics extends JPanel {

	JPanel panel = new JPanel();

	public DisplayGraphics() {// constructor

		JLabel lbl = new JLabel("DisplayGraphics");
		setBorder(BorderFactory.createLineBorder(Color.black));
		add(lbl);

	}
}
