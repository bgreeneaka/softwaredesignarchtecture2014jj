package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.*;

import model.Subject;

public class DBControlsPanel extends View implements Observer {

	private JButton btnSelect = new JButton();
	private JComboBox comboBox = new JComboBox();
	private JTextArea txtArea = new JTextArea();
	private JPanel borderPanel = new JPanel();
	private Subject txtData;
	
	public DBControlsPanel(Subject txtData) {
		// TODO Auto-generated constructor stub
		txtData.registerObserver((Observer)this);
		this.txtData = txtData;
		setLayout(new FlowLayout());
		
		txtArea.setText(txtData.getDbms());
		
		borderPanel.setLayout(new GridLayout(20,3));
		borderPanel.setSize(200,200);
		borderPanel.setBackground(Color.GRAY);
		setBackground(Color.GRAY);
		
		setControls();
		this.add(borderPanel);
		
	}
	
	public void setControls(){
		JLabel label = new JLabel("Select a Database to store text      ");
		comboBox.addItem("Oracle");
		comboBox.addItem("MySQL");
		comboBox.addItem("MonGO");
		borderPanel.add(label);
		borderPanel.add(comboBox);
		btnSelect.setText("Select");
		borderPanel.add(btnSelect);
		borderPanel.add(txtArea);
	}
	
	@Override
	public void update(String txtData,String path,String algorithm,String dbms) {
		// TODO Auto-generated method stub
	}

	@Override
	public void addActionListener(ActionListener selection) {
		// TODO Auto-generated method stub
		btnSelect.addActionListener(selection);
	}

	public void addItemListener(ItemListener item) {
		// TODO Auto-generated method stub
		comboBox.addItemListener(item);
	}
	 public void actionPerformed(ActionEvent e) {
		 txtData.setDbms((String) comboBox.getSelectedItem());   
     }

}