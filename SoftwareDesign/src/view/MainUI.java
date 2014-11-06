
package view;

import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.*;
import model.TextData;
import java.awt.BorderLayout;
import java.awt.SystemColor;


public class MainUI extends JFrame implements Observer {
	
	public MainUI(TextData txtData) {
		super("Text Mining");
		txtData.registerObserver((Observer)this);
		setLayout(new BorderLayout());
		getContentPane().setBackground(SystemColor.controlShadow);
		this.setBounds(100, 100, 1100, 725);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true); // display frame
	}

	public void update(String str1) {
		// TODO Auto-generated method stub
		
	}

	public void addActionListener(ActionListener command) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void update(String txtData, String path, String algorithm, String dbms) {
		// TODO Auto-generated method stub		
	}

	@Override
	public void addItemListener(ItemListener itemListener) {
		// TODO Auto-generated method stub
		
	}
}


