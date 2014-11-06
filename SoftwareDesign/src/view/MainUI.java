
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.*;

import model.Subject;

import java.awt.BorderLayout;
import java.awt.SystemColor;


public class MainUI extends JFrame {
	
	public MainUI(Subject txtData) {
		super("Text Mining");
		setLayout(new BorderLayout());
		getContentPane().setBackground(SystemColor.controlShadow);
		this.setBounds(100, 100, 1100, 725);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true); // display frame
	}
}


