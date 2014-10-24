	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;  //notice javax
	public class GUI extends JFrame
	{
	  JPanel panel = new JPanel();
	  
	  GUI() // constructor 
	   
	  {
	    super("Text Mining"); setBounds(100,100,800,600);
	    GridLayout GLayout = new GridLayout(2,2);
		panel.setLayout(GLayout);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container = this.getContentPane();
	    container.add(userInput()); 
	    container.add(analitics()); 
	    container.add(display1()); 
	    container.add(display2()); 
	    setVisible(true); // display frame
	  }
	
	  private JPanel userInput(){
		  JPanel panel = new JPanel();
		  label lbl = new label;
		panel.add(b new label b new label("userInput"));
	  }
	  private JPanel analitics(){
		  JPanel panel = new JPanel();
	  }
	  private JPanel display1(){
		  JPanel panel = new JPanel();
	  }
		 
	  private JPanel display2(){
		  JPanel panel = new JPanel();
	  }
	  
}
