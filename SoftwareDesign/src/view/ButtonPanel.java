package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.* ;

import model.Subject;
import controller.BtnProcessCmd;
import controller.BtnOpenCmd;
import controller.BtnUpdateCmd;

public class ButtonPanel extends View implements Observer {
	
	private BtnUpdateCmd btnUpdateView;
	private BtnOpenCmd btnOpenFile;
	private BtnProcessCmd btnAnalyse;
	private JComboBox algComboBox = new JComboBox();
	private Subject txtData;
	private JPanel borderPanel = new JPanel();
	private JLabel count = new JLabel("");

	public ButtonPanel(Subject txtData) {
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
	public void update() {
		// TODO Auto-generated method stub	
		if(algComboBox.getSelectedItem().toString().equalsIgnoreCase("Sentence Detector")){
			this.count.setText("Number of sentences =" + Integer.toString(this.txtData.getSentenceCount()));
		}else if(algComboBox.getSelectedItem().toString().equalsIgnoreCase("Tokenizer")){
			this.count.setText("Number of Tokens =" + Integer.toString(this.txtData.getTokenCount()));
		}
	}
	
	public void addBtnCommands(BtnOpenCmd btnOpenFile,BtnUpdateCmd btnUpdateView,BtnProcessCmd btnAnalyse){
		this.btnOpenFile = btnOpenFile;
		this.btnUpdateView = btnUpdateView;
		this.btnAnalyse= btnAnalyse;
		borderPanel.add(btnOpenFile);
		borderPanel.add(btnUpdateView);
		borderPanel.add(btnAnalyse);
		borderPanel.add(count);
	}
	
	public void addComboBox(){
		JLabel label = new JLabel("Select an algrothim to process text      ");
		algComboBox.addItem("Select");
		algComboBox.addItem("Sentence Detector");
		algComboBox.addItem("Tokenizer");
		algComboBox.addItem("Parser");
		algComboBox.addItem("POS Tagger");
		algComboBox.addItem("Chunker");
		borderPanel.add(label);
		borderPanel.add(algComboBox);	
	}
	
	public View getView(){
		return this;	
	}
}
