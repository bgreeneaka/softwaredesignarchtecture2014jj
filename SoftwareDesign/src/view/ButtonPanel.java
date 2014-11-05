package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;

import controller.BtnAnalyseCmd;
import controller.BtnOpenCmd;
import controller.BtnUpdateCmd;
import controller.Command;

public class ButtonPanel extends JPanel implements Observer {
	
	BtnUpdateCmd btnUpdateView;
	BtnOpenCmd btnOpenFile;
	BtnAnalyseCmd btnAnalyse;
	
	public ButtonPanel(BtnOpenCmd btnOpenFile,BtnUpdateCmd btnUpdateView,BtnAnalyseCmd btnAnalyse) {
		// TODO Auto-generated constructor stub
		this.btnOpenFile = btnOpenFile;
		this.btnUpdateView = btnUpdateView;
		this.btnAnalyse= btnAnalyse;
		setLayout(new FlowLayout());
		setBackground(Color.GRAY);
		add(btnOpenFile);
		add(btnUpdateView);
		add(btnAnalyse);
	}
	
	public void addActionListener(ActionListener command) {
		// TODO Auto-generated method stub
	btnUpdateView.addActionListener(command);
	btnOpenFile.addActionListener(command);
	btnAnalyse.addActionListener(command);
	}


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Command action = (Command) e.getSource();
		action.execute();
	}


	@Override
	public void update(String str1,String path,String algorithm,String dbms) {
		// TODO Auto-generated method stub
		
	}
}
