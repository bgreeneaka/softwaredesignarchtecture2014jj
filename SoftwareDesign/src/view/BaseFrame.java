package view;
import java.awt.SystemColor;
import javax.swing.*;


public class BaseFrame extends  JFrame{

	public BaseFrame()  {
		// TODO Auto-generated constructor stub	
	}

	public void renderWindow() {
		// TODO Auto-generated method stub
		this.setBackground(SystemColor.controlShadow);
		this.setBounds(100, 100, 900, 665);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
