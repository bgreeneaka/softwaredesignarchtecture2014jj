	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;  //notice javax
	public class GUI extends JFrame
	{
	 JPanel panel = new JPanel();
	
	  
	  GUI() // constructor 
	   
	  {
	    super("Text Mining"); 
	    setBounds(100,100,800,600);
	    add(userInput(),BorderLayout.NORTH);
	    add(analitics(), BorderLayout.EAST);
	    add(display1(),BorderLayout.WEST);
	    add(display2(),BorderLayout.SOUTH);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	    setVisible(true); // display frame
	  }
	
	  private JPanel userInput(){
		  JPanel panel = new JPanel();
		  JLabel lbl = new JLabel("userInput");
		  panel.add(lbl);
		 return panel;
	  }
	  private JPanel analitics(){
		  JPanel panel = new JPanel();
		  JLabel lbl = new JLabel("analitics");
		  panel.add(lbl);
		  return panel;
	  }
	  private JPanel display1(){
		  JPanel panel = new JPanel();
		  JLabel lbl = new JLabel("display1");
		  panel.add(lbl);
		  return panel;
	  }
		 
	  private JPanel display2(){
		  JPanel panel = new JPanel();
		  JLabel lbl = new JLabel("display2");
		  panel.add(lbl);
		  return panel;
	  }
	  
}
