package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.*;

public class DBControlsPanel extends View implements Observer {

	JButton btnSelect = new JButton();
	JComboBox comboBox = new JComboBox();
	JTextArea txtArea = new JTextArea();

	public DBControlsPanel() {
		// TODO Auto-generated constructor stub
		setLayout(new FlowLayout());
		setBackground(Color.GRAY);
		comboBox.addItem("Oracle");
		comboBox.addItem("MySQL");
		comboBox.addItem("MonGO");
		btnSelect.setText("Select");
		add(comboBox);
		add(btnSelect);
		this.setVisible(true);
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

}