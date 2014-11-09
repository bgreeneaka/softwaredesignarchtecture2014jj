package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;

import javax.swing.JComboBox;

import command.Command;
import strategy.AlgChunker;
import strategy.AlgPOSTagger;
import strategy.AlgParser;
import strategy.AlgSentenceDetector;
import strategy.AlgTokenizer;
import model.TextSubject;

public class Controller {
	
	private TextSubject txtData;
	private String alg;
	
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
		//Listener for items selected from drop down menus
		public void itemStateChanged(ItemEvent event) {
			JComboBox comboBox = (JComboBox) event.getSource();
			Object item = event.getItem();
			if(item.equals("Oracle")||item.equals("SQL")||item.equals("Mongo")){
				txtData.setDbms(item.toString()); 
			}else{
				alg = item.toString();
				txtData.setAlgorithm(item.toString()); 
				selectAlgorithm();
			}
		}
	}
	

	public void selectAlgorithm() {

		if (alg ==""){
			System.out.println("ERROR");
		}
		else if(alg =="Sentence Detector"){
			this.txtData.setProcessStrategy(new AlgSentenceDetector());
			this.txtData.setAlgorithm("Sentence Detector");
		}
		else if(alg =="Tokenizer"){
			this.txtData.setProcessStrategy(new AlgTokenizer());
			this.txtData.setAlgorithm("Sentence Detector");
		}
		else if(alg =="Parser"){
			this.txtData.setProcessStrategy(new AlgParser());
			this.txtData.setAlgorithm("Tokenizer");
		}	
		else if(alg =="POS Tagger"){
			this.txtData.setProcessStrategy(new AlgPOSTagger());
			this.txtData.setAlgorithm("POS Tagger");
		}
		else if(alg =="Chunker"){
			this.txtData.setProcessStrategy(new AlgChunker());
			this.txtData.setAlgorithm("Chunker");
		}
		else{
			System.out.println("ERROR");
		}

	}


	public void setAlg(String string) {
		alg =string;
		
	}


	
}

