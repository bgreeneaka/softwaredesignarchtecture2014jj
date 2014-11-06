package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.*;

import controller.Command;
import model.TextData;

public class DBControlsPanel extends JPanel implements Observer, Command {

	JButton btnSelect = new JButton();
	JComboBox DBcb = new JComboBox();
	String db;
	private TextData txtData = new TextData();

	public DBControlsPanel(TextData txtData) {
		// TODO Auto-generated constructor stub
		this.txtData = txtData;
		db = "";
		setLayout(new FlowLayout());
		setBackground(Color.GRAY);
		DBcb.addItem("Oracle");
		DBcb.addItem("MySQL");
		DBcb.addItem("MonGO");
		btnSelect.setText("Select");
		add(DBcb);
		add(btnSelect);
		DBcb.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JComboBox jcmbDB = (JComboBox) e.getSource();
				String seletedDB = (String) jcmbDB.getSelectedItem();
				db = seletedDB;
				execute();
			}
		});
	}

	@Override
	public void update(String txtData, String path, String algorithm,
			String dbms) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addActionListener(ActionListener selection) {
		// TODO Auto-generated method stub
		btnSelect.addActionListener(selection);
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Command action = (Command) e.getSource();
		action.execute();
	}

	public void addItemListener(ItemListener item) {
		// TODO Auto-generated method stub
		DBcb.addItemListener(item);
	}

	@Override
	public void execute() {
		this.txtData.dbms=db;
		this.txtData.notifyObservers();
		System.out.println(db);
		
	}

}