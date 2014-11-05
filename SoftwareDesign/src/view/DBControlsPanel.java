package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.*;

public class DBControlsPanel extends JPanel implements Observer {

	JButton btnSelect = new JButton();
	JComboBox comboBox = new JComboBox();

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
	}

	@Override
	public void update(String str1,String path,String algorithm,String dbms) {
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