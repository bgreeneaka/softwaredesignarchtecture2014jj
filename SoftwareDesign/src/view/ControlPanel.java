package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.*;

public class ControlPanel extends JPanel implements Observer {

	JButton btnAnalyse = new JButton();
	JComboBox algcb = new JComboBox();

	public ControlPanel() {
		// TODO Auto-generated constructor stub
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
