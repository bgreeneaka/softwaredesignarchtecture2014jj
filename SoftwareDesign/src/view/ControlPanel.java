package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.*;

import model.TextData;
import controller.CbAlgorithmCmd;
import controller.Command;

public class ControlPanel extends JPanel implements Observer, Command {

	JButton btnAnalyse = new JButton();
	JComboBox algcb = new JComboBox();
	String alg;
	CbAlgorithmCmd cbAlgorithm;
	public TextData txtData = new TextData();
	public ControlPanel(CbAlgorithmCmd cbAlgorithm, TextData txtData) {
		// TODO Auto-generated constructor stub
		this.txtData = txtData;
		this.cbAlgorithm = cbAlgorithm;
		alg="";
		setLayout(new FlowLayout());
		setBackground(Color.GRAY);
		algcb.addItem("NLPTest");
		algcb.addItem("NLPTest2");
		algcb.addItem("NLPTest3");
		btnAnalyse.setText("Analyse");
		add(cbAlgorithm);
		add(algcb);
		add(btnAnalyse);
		algcb.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JComboBox jcmbAloritms = (JComboBox) e.getSource();
				String seletedAlgorithm = (String) jcmbAloritms.getSelectedItem();
				//datePattern_Current = seletedDate;
				//showDateinLabel();
				//this.txtData.algorithm=seletedAlgorithm;
				//this.txtData.notifyObservers();
				//txtData.algorithm="dd";
				//txtData.notifyObservers();
				alg=seletedAlgorithm;
				execute();
			}
		});
	}

	@Override
	public void update(String str1,String path,String algorithm,String dbms) {
		//
		
	}

	@Override
		public void addActionListener(ActionListener strategy) {
		btnAnalyse.addActionListener(strategy);
		System.out.println("wwww");
		cbAlgorithm.addActionListener(strategy);
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Command action = (Command) e.getSource();
		action.execute();
	}
	public void addItemListener(ItemListener item) {
		// TODO Auto-generated method stub
		algcb.addItemListener(item);
		cbAlgorithm.addItemListener(item);
	}

	@Override
	public void execute() {
		this.txtData.algorithm=alg;
		this.txtData.notifyObservers();
		System.out.println(alg);
	}

	
	
	

}
