package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.* ;

import model.TextData;
import controller.BtnProcessCmd;
import controller.BtnOpenCmd;
import controller.BtnUpdateCmd;

public class ButtonPanel extends JPanel implements Observer {
	
	private BtnUpdateCmd btnUpdateView;
	private BtnOpenCmd btnOpenFile;
	private BtnProcessCmd btnAnalyse;
	private JComboBox algComboBox = new JComboBox();
	private TextData txtData;
	private JPanel borderPanel = new JPanel();
	
	public ButtonPanel(TextData txtData) {
		txtData.registerObserver((Observer)this);
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
	
	public void addItemListener(ItemListener item) {
		// TODO Auto-generated method stub
		algComboBox.addItemListener(item);
	}

	@Override
	public void update(String txtData,String path,String algorithm,String dbms) {
		// TODO Auto-generated method stub	
	}
	
	public void addBtnCommands(BtnOpenCmd btnOpenFile,BtnUpdateCmd btnUpdateView,BtnProcessCmd btnAnalyse/* CbAlgorithmCmd cbAlgorithm*/){
		JPanel Panel = new JPanel();
		this.btnOpenFile = btnOpenFile;
		this.btnUpdateView = btnUpdateView;
		this.btnAnalyse= btnAnalyse;
		borderPanel.add(btnOpenFile);
		borderPanel.add(btnUpdateView);
		borderPanel.add(btnAnalyse);
	}
	
	public void addComboBox(){
		JLabel label = new JLabel("Select an algrothim to process text      ");
		algComboBox.addItem("Select");
		algComboBox.addItem("Detect Sentence");
		algComboBox.addItem("Detect Tokens");
		borderPanel.add(label);
		borderPanel.add(algComboBox);	
		this.add(borderPanel);
	}
}
