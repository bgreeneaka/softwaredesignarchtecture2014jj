package view;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;



	public class Analitics extends JPanel {

		JPanel panel = new JPanel();

		Analitics() {// constructor

			JLabel lbl = new JLabel("Analitics");
			setBorder(BorderFactory.createLineBorder(Color.black));
			add(lbl);

		}
	}


