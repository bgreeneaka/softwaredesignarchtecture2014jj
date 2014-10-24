package GUI;
	import java.awt.Color;

	import javax.swing.BorderFactory;
	import javax.swing.JLabel;
	import javax.swing.JPanel;



	

	public class UserInput extends JPanel {

		JPanel panel = new JPanel();

		UserInput() {// constructor

			JLabel lbl = new JLabel("UserInput");
			setBorder(BorderFactory.createLineBorder(Color.black));
			add(lbl);

		}
	}


