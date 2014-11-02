package view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import model.TextData;
import controller.BtnOpenCmd;
import controller.BtnUpdateCmd;
import controller.Command;
import controller.Controller;
import controller.FileOpenCommand;

import javax.swing.border.BevelBorder;

import java.awt.BorderLayout;
import java.awt.SystemColor;
import java.awt.Color;


public class MainUI extends JFrame implements Observer {
	

	public MainUI() {
		super("Text Mining");
		setLayout(new BorderLayout());
		getContentPane().setBackground(SystemColor.controlShadow);
		this.setBounds(100, 100, 900, 665);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true); // display frame
	}

	@Override
	public void update(String str1) {
		// TODO Auto-generated method stub
		
	}

	public void addActionListener(ActionListener command) {
		// TODO Auto-generated method stub
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Command action = (Command) e.getSource();
		action.execute();
	}
}

