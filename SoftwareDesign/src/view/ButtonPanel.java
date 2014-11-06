package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;

import model.TextData;
import controller.BtnAnalyseCmd;
import controller.BtnOpenCmd;
import controller.BtnUpdateCmd;
import controller.CbAlgorithmCmd;
import controller.Command;

public class ButtonPanel extends JPanel implements Observer {
	
	private BtnUpdateCmd btnUpdateView;
	private BtnOpenCmd btnOpenFile;
	private BtnAnalyseCmd btnAnalyse;
	private CbAlgorithmCmd cbAlgorithm;
	private JComboBox algComboBox = new JComboBox();
	private TextData txtData;
	private JPanel borderPanel = new JPanel();
	
	public ButtonPanel(TextData txtData) {
		this.txtData = txtData;
		setLayout(new FlowLayout());
		setBackground(Color.GRAY);
		borderPanel.setLayout(new GridLayout(20,3));
		borderPanel.setSize(200,200);
		borderPanel.setBackground(Color.GRAY);
		addComboBox();
		this.add(borderPanel);

	}
	
	public void addActionListener(ActionListener command) {
		// TODO Auto-generated method stub
	btnUpdateView.addActionListener(command);
	btnOpenFile.addActionListener(command);
	btnAnalyse.addActionListener(command);
	}

	@Override
	public void update(String txtData,String path,String algorithm,String dbms) {
		// TODO Auto-generated method stub	
	}
	
	public void addBtnCommands(BtnOpenCmd btnOpenFile,BtnUpdateCmd btnUpdateView,BtnAnalyseCmd btnAnalyse, CbAlgorithmCmd cbAlgorithm){
		JPanel Panel = new JPanel();
		this.btnOpenFile = btnOpenFile;
		this.btnUpdateView = btnUpdateView;
		this.btnAnalyse= btnAnalyse;
		borderPanel.add(btnOpenFile);
		borderPanel.add(btnUpdateView);
		borderPanel.add(btnAnalyse);
	}
	
	public void addComboBox(){
//		borderPanel.setLayout(new GridLayout(20,3));
//		borderPanel.setSize(200,200);
//		borderPanel.setBackground(Color.GRAY);
		JPanel strategyPanel = new JPanel();
		JLabel label = new JLabel("Select an algrothim to process text      ");
		algComboBox.addItem("NLPTest");
		algComboBox.addItem("NLPTest2");
		algComboBox.addItem("NLPTest3");
		borderPanel.add(label);
		borderPanel.add(algComboBox);	
		this.add(borderPanel);
	}
}
