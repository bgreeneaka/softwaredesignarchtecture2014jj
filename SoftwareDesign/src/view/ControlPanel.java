package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.JButton;
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
	
	JButton btnAnalyse = new JButton();
    JComboBox algcb = new JComboBox();
	
	
	
	public ControlPanel(){
		 setLayout(new FlowLayout());
         setBackground(Color.GRAY);
         algcb.addItem("NLPTest");
         algcb.addItem("NLPTest2");
         algcb.addItem("NLPTest3");
         btnAnalyse.setText("Analyse");
         add(algcb);
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

    public void addItemListener(ItemListener item) {
                    // TODO Auto-generated method stub
    	algcb.addItemListener(item);
    }

}
