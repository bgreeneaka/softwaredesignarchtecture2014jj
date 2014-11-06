package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.*;

import model.TextData;
import controller.BtnAnalyseCmd;
import controller.Command;

public class ControlPanel extends JPanel implements Observer {

	JComboBox algcb = new JComboBox();
	BtnAnalyseCmd btnAnalyse;
	String alg;
	private TextData txtData = new TextData();

	public ControlPanel(BtnAnalyseCmd btnAnalyse, TextData txtData) {
		// TODO Auto-generated constructor stub
		this.btnAnalyse = btnAnalyse;
		this.txtData = txtData;

		alg = "";

		setLayout(new FlowLayout());
		setBackground(Color.GRAY);
		algcb.addItem("NLPTest");
		algcb.addItem("NLPTest2");
		algcb.addItem("NLPTest3");

		add(algcb);
		add(btnAnalyse);
		algcb.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JComboBox jcmbAloritms = (JComboBox) e.getSource();
				String seletedAlgorithm = (String) jcmbAloritms
						.getSelectedItem();
				// datePattern_Current = seletedDate;
				// showDateinLabel();
				// this.txtData.algorithm=seletedAlgorithm;
				// this.txtData.notifyObservers();
				// txtData.algorithm="dd";
				// txtData.notifyObservers();
				alg = seletedAlgorithm;
				updateSubject();
							}
		});
	}

	@Override
	public void update(String txtData, String path, String algorithm,
			String dbms) {
		//

	}

	@Override
	public void addActionListener(ActionListener command) {
		btnAnalyse.addActionListener(command);
	
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Command action = (Command) e.getSource();
		action.execute();
	}

	
	private void updateSubject() {
		this.txtData.algorithm = alg;
		this.txtData.notifyObservers();
		System.out.println(alg);
	}

}
