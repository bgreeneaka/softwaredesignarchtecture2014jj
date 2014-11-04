package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import controller.BtnAnalyseCmd;
import controller.BtnOpenCmd;
import controller.BtnUpdateCmd;
import controller.Command;
import view.ViewFile;
import model.TextData;


public class ControlPanel extends JPanel implements Observer {
	

	BtnAnalyseCmd btnAnalyse;
	
	private JTextArea txtArea = new JTextArea("txt area created"); // New  txt area with default txt
	
	
	public ControlPanel(){
		TextData txtData = new TextData();
		String[] choices = { "Algoritm 1","Algoritm 2", "Algoritm 3","Algoritm 4","Algoritm 5","Algoritm 6"};
		final JComboBox<String> algcb = new JComboBox<String>(choices);
		//algcb.addItemListener(itemListener);
		algcb.setVisible(true);
	    add(algcb);
		System.out.println("ControlPanelclass");
		setLayout(new FlowLayout());
		
		setBackground(Color.GRAY);
		
		btnAnalyse = new BtnAnalyseCmd("Analyse", txtData);
		add(btnAnalyse);
	}
	@Override
	public void update(String str1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addActionListener(ActionListener strategy) {
			btnAnalyse.addActionListener(strategy);
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Command action = (Command) e.getSource();
		action.execute();
	}

}
