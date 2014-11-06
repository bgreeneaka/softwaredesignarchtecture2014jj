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
	JComboBox dbmscb = new JComboBox();
	String dbms;
	private TextData txtData = new TextData();

	public DBControlsPanel(TextData txtData) {
		// TODO Auto-generated constructor stub
		this.txtData = txtData;
		dbms = "";
		setLayout(new FlowLayout());
		setBackground(Color.GRAY);
		dbmscb.addItem("Oracle");
		dbmscb.addItem("MySQL");
		dbmscb.addItem("MonGO");
		btnSelect.setText("Select");
		add(dbmscb);
		add(btnSelect);
		dbmscb.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JComboBox dbmscb = (JComboBox) e.getSource();
				String seletedDBMS = (String) dbmscb.getSelectedItem();
				// datePattern_Current = seletedDate;
				// showDateinLabel();
				// this.txtData.algorithm=seletedAlgorithm;
				// this.txtData.notifyObservers();
				// txtData.algorithm="dd";
				// txtData.notifyObservers();
				dbms = seletedDBMS;
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
		dbmscb.addItemListener(item);
	}

	@Override
	public void execute() {
		this.txtData.dbms = dbms;
		this.txtData.notifyObservers();
		System.out.println(dbms);

	}

}