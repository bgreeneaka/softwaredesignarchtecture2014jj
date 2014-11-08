package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;

import javax.swing.JComboBox;

import model.Subject;
import model.TextData;
import model.TextSubject;

public class Controller {
	
	private TextSubject txtData;
	String alg;
	
	public Controller(TextSubject txtData) {
		// Constructor
		this.txtData = txtData;
		this.txtData.addCommandListner(new CommandListner()); //Add Command listener to the model. 
		this.txtData.addStrategyListner(new StrategyListner()); //Add Strategy listener to the model. 
	}
	
	public class CommandListner implements ActionListener {
		//Action for when update is pushed
		@Override
		public void actionPerformed(ActionEvent e) {
			Command action = (Command) e.getSource();
			try {
				action.execute();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}	
	}
	
	public class StrategyListner implements ItemListener {
		//Adds selected algrothm to the subject when selected from the comboBox
		public void itemStateChanged(ItemEvent event) {
			JComboBox comboBox = (JComboBox) event.getSource();
			Object item = event.getItem();
			alg = item.toString();
			selectAlgorithm();
			//txtData.setAlgorithm(item.toString());
		}
	}
	
	private void selectAlgorithm() {
		//this.txtData.setAlgorithmString(alg);
	
		if (alg ==""){
			System.out.println("ERROR");
		}
		else if(alg =="Sentence Detector"){
			System.out.println("Sentence Detector");
		this.txtData.setProcessStrategy(new AlgSentenceDetector());
		}
		else if(alg =="Tokenizer"){
			System.out.println("Tokenizer");
			this.txtData.setProcessStrategy(new AlgTokenizer());
			
		}
		else if(alg =="Name Finder"){
			System.out.println("Name Finder");
			this.txtData.setProcessStrategy(new AlgNameFinder());
		}	
		else if(alg =="POS Tagger"){
			System.out.println("POS Tagger");
			this.txtData.setProcessStrategy(new AlgPOSTagger());
		}
		else if(alg =="Chunker"){
			System.out.println("Chunker");
			this.txtData.setProcessStrategy(new AlgChunker());
		}
		else{
			System.out.println("ERROR");
		}
		
		//this.txtData.notifyObservers();
		System.out.println(alg);
	}
}

