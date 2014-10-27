package view;
import java.awt.*;
import javax.swing.*; //notice javax

public class GUI extends JFrame {
	JPanel panel = new JPanel();

	public GUI() // constructor

	{
		super("Text Mining");
		setLayout(new GridLayout(2, 2));
		setBounds(100, 100, 800, 600);
		add(new UserInput());
		add(new Analitics());
		add(new DisplayText());
		add(new DisplayGraphics());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true); // display frame
	}



}
