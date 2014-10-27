package view;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

import model.TextData;
import controller.Controller;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import java.awt.Color;

public class MainUI extends JFrame implements Observer {
	private JButton btnUpdateView = new JButton("Update View");
	private final JButton btnOpenFile = new JButton("Open File");
	private final JButton btnAlg1 = new JButton("Alg 1");
	private final JButton btnAlg2 = new JButton("Alg 2");
	private final JComboBox comboBox = new JComboBox();

	public MainUI() {
		super("Text Mining");
		getContentPane().setBackground(SystemColor.controlShadow);
		this.setBounds(100, 100, 900, 665);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, btnAlg2, 6,
				SpringLayout.SOUTH, btnAlg1);
		springLayout.putConstraint(SpringLayout.WEST, btnAlg2, 0,
				SpringLayout.WEST, btnUpdateView);
		springLayout.putConstraint(SpringLayout.SOUTH, btnAlg2, 29,
				SpringLayout.SOUTH, btnAlg1);
		springLayout.putConstraint(SpringLayout.EAST, btnAlg2, 0,
				SpringLayout.EAST, btnUpdateView);
		springLayout.putConstraint(SpringLayout.NORTH, btnAlg1, 47,
				SpringLayout.SOUTH, btnUpdateView);
		springLayout.putConstraint(SpringLayout.WEST, btnAlg1, 0,
				SpringLayout.WEST, btnUpdateView);
		springLayout.putConstraint(SpringLayout.SOUTH, btnAlg1, 70,
				SpringLayout.SOUTH, btnUpdateView);
		springLayout.putConstraint(SpringLayout.EAST, btnAlg1, 0,
				SpringLayout.EAST, btnUpdateView);
		springLayout.putConstraint(SpringLayout.NORTH, btnOpenFile, -44,
				SpringLayout.NORTH, btnUpdateView);
		springLayout.putConstraint(SpringLayout.WEST, btnOpenFile, 10,
				SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnOpenFile, -21,
				SpringLayout.NORTH, btnUpdateView);
		springLayout.putConstraint(SpringLayout.EAST, btnOpenFile, 0,
				SpringLayout.EAST, btnUpdateView);
		springLayout.putConstraint(SpringLayout.NORTH, btnUpdateView, 85,
				SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnUpdateView, 10,
				SpringLayout.WEST, getContentPane());

		// messing around
		springLayout.putConstraint(SpringLayout.EAST, comboBox, 0,
				SpringLayout.NORTH, btnAlg2);
		// springLayout.put
		// messing around

		getContentPane().setLayout(springLayout);

		TextData txtData = new TextData();
		txtData.registerObserver(this);
		Controller controller = new Controller(txtData);

		getContentPane().add(btnUpdateView);
		getContentPane().add(btnOpenFile);
		getContentPane().add(btnAlg1);
		getContentPane().add(btnAlg2);

		OpenFile openFile = new OpenFile();
		springLayout.putConstraint(SpringLayout.NORTH, openFile, 21,
				SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, openFile, 36,
				SpringLayout.EAST, btnUpdateView);
		springLayout.putConstraint(SpringLayout.SOUTH, openFile, -348,
				SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, openFile, -39,
				SpringLayout.EAST, getContentPane());
		openFile.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0,
				0), SystemColor.controlText, SystemColor.textInactiveText,
				SystemColor.textInactiveText));
		getContentPane().add(openFile);
		txtData.registerObserver(openFile);

		this.setVisible(true); // display frame

	}

	@Override
	public void update(String str1) {
		// TODO Auto-generated method stub

	}

	public void addActionListener(ActionListener updateListner) {
		// TODO Auto-generated method stub
		btnUpdateView.addActionListener(updateListner);
			}
}
