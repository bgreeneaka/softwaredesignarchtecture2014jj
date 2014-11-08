package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.*;

import controller.BtnOpenCmd;
import controller.BtnProcessCmd;
import controller.BtnUpdateCmd;
import controller.BtnCreateDBCmd;
import model.Subject;

public class DBControlsPanel extends View implements Observer {

	private BtnCreateDBCmd btnCreateDB;
	private JComboBox comboBox = new JComboBox();
	private JPanel borderPanel = new JPanel();
	private Subject txtData;
	
	public DBControlsPanel(Subject txtData) {
		// TODO Auto-generated constructor stub
		txtData.registerObserver((Observer)this);
		this.txtData = txtData;
		setLayout(new FlowLayout());
		
		borderPanel.setLayout(new GridLayout(20,3));
		borderPanel.setSize(200,200);
		borderPanel.setBackground(Color.GRAY);
		setBackground(Color.GRAY);
		
		setControls();
		this.add(borderPanel);
		
	}
	
	public void setControls(){
		JLabel label = new JLabel("Select a Database to store text      ");
		comboBox.addItem("Select");
		comboBox.addItem("Oracle");
		comboBox.addItem("SQL");
		comboBox.addItem("Mongo");
		borderPanel.add(label);
		borderPanel.add(comboBox);
	}
	
	public void addBtnCommands(BtnCreateDBCmd btnCreateDB){
		this.btnCreateDB = btnCreateDB;
		borderPanel.add(btnCreateDB);
	}
	
	@Override
	public void update(/*String txtData,String path,String algorithm,String dbms*/) {
		// TODO Auto-generated method stub
	}

	@Override
	public void addActionListener(ActionListener selection) {
		// TODO Auto-generated method stub
		btnCreateDB.addActionListener(selection);
	}

	public void addItemListener(ItemListener item) {
		// TODO Auto-generated method stub
		comboBox.addItemListener(item);
	}
}