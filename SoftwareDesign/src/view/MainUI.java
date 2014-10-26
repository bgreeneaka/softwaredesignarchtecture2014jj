package view;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

import model.TextData;
import controller.Controller;


public class MainUI extends JFrame {
	
	private JButton btnOpenFile = new JButton("Open File");
	private JButton btnUpdateView = new JButton("Update View");
	
	public MainUI() {
		super("Text Mining");
		getContentPane().setBackground(UIManager.getColor("InternalFrame.inactiveTitleBackground"));
		this.setBounds(100, 100, 900, 665);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, btnUpdateView, 85, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnUpdateView, 10, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnOpenFile, 0, SpringLayout.WEST, btnUpdateView);
		springLayout.putConstraint(SpringLayout.SOUTH, btnOpenFile, -24, SpringLayout.NORTH, btnUpdateView);
		springLayout.putConstraint(SpringLayout.EAST, btnOpenFile, -781, SpringLayout.EAST, getContentPane());
		getContentPane().setLayout(springLayout);
		
		
		TextData txtData = new TextData(); // (Model) Create new subject/ model which holds all data 
		OpenFile displayFile = new OpenFile();
		springLayout.putConstraint(SpringLayout.NORTH, displayFile, 29, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, displayFile, 31, SpringLayout.EAST, btnUpdateView);
		springLayout.putConstraint(SpringLayout.SOUTH, displayFile, -310, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, displayFile, -33, SpringLayout.EAST, getContentPane());
		txtData.registerObserver(displayFile);  //register observer with subject
		Controller controller  = new Controller(txtData); //Create new controller and add the model to it
		btnUpdateView.addActionListener(l);
		displayFile.setVisible(true); 
		
		
		JPanel displayTextPanel = new JPanel();
		springLayout.putConstraint(SpringLayout.SOUTH, displayTextPanel, 294, SpringLayout.NORTH, getContentPane());
		displayTextPanel.setBorder(UIManager.getBorder("Table.scrollPaneBorder"));
		springLayout.putConstraint(SpringLayout.NORTH, displayTextPanel, 20, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, displayTextPanel, 146, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, displayTextPanel, -21, SpringLayout.EAST, getContentPane());
		FlowLayout fl_displayTextPanel = (FlowLayout) displayTextPanel.getLayout();
		fl_displayTextPanel.setAlignment(FlowLayout.RIGHT);
		getContentPane().add(displayFile);
		getContentPane().add(btnOpenFile);
		getContentPane().add(btnUpdateView);
		this.setVisible(true); // display frame
		
//		JPanel buttonPanel = new JPanel();
//		buttonPanel.setBounds(10, 10, 10, 10);
//		buttonPanel.setVisible(true);
//		buttonPanel.add(updateBtn);
//		buttonPanel.add(fileOpenBtn);
//		getContentPane().add(buttonPanel);
	}
	
	

}
