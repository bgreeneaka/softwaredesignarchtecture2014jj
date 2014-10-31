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

import java.awt.SystemColor;
import java.awt.Color;


public class MainUI extends JFrame implements Observer {
	
	BtnUpdateCmd btnUpdateView;
	BtnOpenCmd btnOpenFile;
	
	public MainUI(JComponent comp, BtnOpenCmd btnOpenFile,BtnUpdateCmd btnUpdateView, JButton btnAlg1, JButton btnAlg2) {
		super("Text Mining");
		this.btnOpenFile = btnOpenFile;
		this.btnUpdateView = btnUpdateView;
		getContentPane().setBackground(SystemColor.controlShadow);
		this.setBounds(100, 100, 900, 665);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, btnAlg2, 6, SpringLayout.SOUTH, btnAlg1);
		springLayout.putConstraint(SpringLayout.WEST, btnAlg2, 0, SpringLayout.WEST, btnUpdateView);
		springLayout.putConstraint(SpringLayout.SOUTH, btnAlg2, 29, SpringLayout.SOUTH, btnAlg1);
		springLayout.putConstraint(SpringLayout.EAST, btnAlg2, 0, SpringLayout.EAST, btnUpdateView);
		springLayout.putConstraint(SpringLayout.NORTH, btnAlg1, 47, SpringLayout.SOUTH, btnUpdateView);
		springLayout.putConstraint(SpringLayout.WEST, btnAlg1, 0, SpringLayout.WEST, btnUpdateView);
		springLayout.putConstraint(SpringLayout.SOUTH, btnAlg1, 70, SpringLayout.SOUTH, btnUpdateView);
		springLayout.putConstraint(SpringLayout.EAST, btnAlg1, 0, SpringLayout.EAST, btnUpdateView);
		springLayout.putConstraint(SpringLayout.NORTH, btnOpenFile, -44, SpringLayout.NORTH, btnUpdateView);
		springLayout.putConstraint(SpringLayout.WEST, btnOpenFile, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnOpenFile, -21, SpringLayout.NORTH, btnUpdateView);
		springLayout.putConstraint(SpringLayout.EAST, btnOpenFile, 0, SpringLayout.EAST, btnUpdateView);
		springLayout.putConstraint(SpringLayout.NORTH, btnUpdateView, 85, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnUpdateView, 10, SpringLayout.WEST, getContentPane());
		getContentPane().setLayout(springLayout);

		
		this.add(btnUpdateView);
		getContentPane().add(btnOpenFile);
		getContentPane().add(btnAlg1);
		getContentPane().add(btnAlg2);
		
		springLayout.putConstraint(SpringLayout.NORTH, comp, 21, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, comp, 36, SpringLayout.EAST, btnUpdateView);
		springLayout.putConstraint(SpringLayout.SOUTH, comp, -348, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, comp, -39, SpringLayout.EAST, getContentPane());
		comp.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), SystemColor.controlText, SystemColor.textInactiveText, SystemColor.textInactiveText));
		getContentPane().add(comp);
	
		this.setVisible(true); // display frame
	}

	@Override
	public void update(String str1) {
		// TODO Auto-generated method stub
		
	}

	public void addActionListener(ActionListener command) {
		// TODO Auto-generated method stub
		btnUpdateView.addActionListener(command);
		btnOpenFile.addActionListener(command);
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Command action = (Command) e.getSource();
		action.execute();
	}
}

