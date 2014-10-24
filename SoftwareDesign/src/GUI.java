	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;  //notice javax
	public class GUI extends JFrame
	{
	  JPanel panel = new JPanel(new GridLayout(2,2,2,2));
	  
	  GUI() // constructor 
	   
	  {
	    super("Text Mining"); setBounds(100,100,800,600);
	    //GridLayout GLayout = new GridLayout(2,2,2,2);
		//panel.setLayout(GLayout);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   // Container container = this.getContentPane();
	    //container.add(userInput()); 
	    //container.add(analitics()); 
	    //container.add(display1()); 
	   // 
	   
	    //container.add(display2()); 
	   // panel.add(userInput()); 
	   // panel.add(analitics()); 
	   // panel.add(new JLabel("Enter Roll"));
	   // panel.add(new JLabel("Enter Roll"));
	   // panel.add(new JLabel("Enter Roll"));
	   // panel.add(new JLabel("Enter Roll"));
	    //panel.add(display1()); 
	    //panel.add(display2()); 
	    GridLayout experimentLayout = new GridLayout(0,2);
	    panel.setLayout(experimentLayout);

	    panel.add(new JButton("Button 1"));
	    panel.add(new JButton("Button 2"));
	    panel.add(new JButton("Button 3"));
	    panel.add(new JButton("Long-Named Button 4"));
	    panel.add(new JButton("5"));
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
