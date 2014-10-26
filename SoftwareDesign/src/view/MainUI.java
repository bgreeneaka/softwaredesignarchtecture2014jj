package view;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

import model.TextData;
import controller.Controller;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;


public class MainUI extends JFrame implements Observer {
	
	private JButton btnOpenFile = new JButton("Open File");
	private JButton btnUpdateView = new JButton("Update View");
	private final JPanel txtPanel = new JPanel();
	
	public MainUI() {
		super("Text Mining");
		getContentPane().setBackground(SystemColor.controlShadow);
		this.setBounds(100, 100, 900, 665);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, txtPanel, 0, SpringLayout.NORTH, btnOpenFile);
		springLayout.putConstraint(SpringLayout.WEST, txtPanel, -743, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, txtPanel, -367, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, txtPanel, -37, SpringLayout.EAST, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnOpenFile, 0, SpringLayout.WEST, btnUpdateView);
		springLayout.putConstraint(SpringLayout.SOUTH, btnOpenFile, -24, SpringLayout.NORTH, btnUpdateView);
		springLayout.putConstraint(SpringLayout.EAST, btnOpenFile, 0, SpringLayout.EAST, btnUpdateView);
		springLayout.putConstraint(SpringLayout.NORTH, btnUpdateView, 85, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnUpdateView, 10, SpringLayout.WEST, getContentPane());
		getContentPane().setLayout(springLayout);
		
		
		TextData txtData = new TextData();
		OpenFile displayFile = new OpenFile();
		txtData.registerObserver(displayFile);
		txtData.registerObserver(this);
		Controller controller  = new Controller(txtData);
		displayFile.setVisible(true);
		
		
		getContentPane().add(btnOpenFile);
		getContentPane().add(btnUpdateView);
		txtPanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		getContentPane().add(txtPanel);
		txtPanel.add(displayFile);
		this.setVisible(true); // display frame
		

	}

	@Override
	public void update(String str1) {
		// TODO Auto-generated method stub
		
	}

	public void addActionListener(ActionListener updateListner) {
		// TODO Auto-generated method stub
		btnUpdateView.addActionListener(updateListner);
	}
}
