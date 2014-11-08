package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.* ;

import model.Subject;
import model.TextData;
import controller.AlgChunker;
import controller.AlgNameFinder;
import controller.AlgPOSTagger;
import controller.AlgSentenceDetector;
import controller.AlgTokenizer;
import controller.BtnProcessCmd;
import controller.BtnOpenCmd;
import controller.BtnUpdateCmd;
import controller.Command;

public class ButtonPanel extends JPanel implements Observer {
	
	private BtnUpdateCmd btnUpdateView;
	private BtnOpenCmd btnOpenFile;
	private BtnProcessCmd btnAnalyse;
	private JComboBox algComboBox = new JComboBox();
	private Subject txtData;
	private JPanel borderPanel = new JPanel();
//	String alg;
	
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
//		System.out.println("item action listner activated");
//		alg = (String) algComboBox.getSelectedItem();
//		selectAlgorithm();
	}

	@Override
	public void update(String txtData,String path,String algorithm,String dbms) {
		// TODO Auto-generated method stub	
	}
	
	public void addBtnCommands(BtnOpenCmd btnOpenFile,BtnUpdateCmd btnUpdateView,BtnProcessCmd btnAnalyse/* CbAlgorithmCmd cbAlgorithm*/){
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
		algComboBox.addItem("Sentence Detector");
		algComboBox.addItem("Tokenizer");
		algComboBox.addItem("Name Finder");
		algComboBox.addItem("POS Tagger");
		algComboBox.addItem("Chunker");
		borderPanel.add(label);
		borderPanel.add(algComboBox);	
	}
	
//	public void actionPerformed(ActionEvent e) {
//		
//		 alg = (String) algComboBox.getSelectedItem();
//		 selectAlgorithm();
//    }
	
//	private void selectAlgorithm() {
//		//this.txtData.setAlgorithmString(alg);
//	
//		if (alg ==""){
//			System.out.println("ERROR");
//		}
//		else if(alg =="Sentence Detector"){
//			System.out.println("Sentence Detector");
//		this.txtData.setProcessStrategy(new AlgSentenceDetector());
//		}
//		else if(alg =="Tokenizer"){
//			System.out.println("Tokenizer");
//			this.txtData.setProcessStrategy(new AlgTokenizer());
//			
//		}
//		else if(alg =="Name Finder"){
//			System.out.println("Name Finder");
//			this.txtData.setProcessStrategy(new AlgNameFinder());
//		}	
//		else if(alg =="POS Tagger"){
//			System.out.println("POS Tagger");
//			this.txtData.setProcessStrategy(new AlgPOSTagger());
//		}
//		else if(alg =="Chunker"){
//			System.out.println("Chunker");
//			this.txtData.setProcessStrategy(new AlgChunker());
//		}
//		else{
//			System.out.println("ERROR");
//		}
//		
//		this.txtData.notifyObservers();
//		System.out.println(alg);
//	}

}
