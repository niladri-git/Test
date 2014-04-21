/* 	There are two ways to create a frame:

    By creating the object of Frame class (association)
    By extending Frame class (inheritance)
*/

// Simple example of Swing by Association:

import javax.swing.*;  

public class Simple1 {  

    JFrame f = new JFrame();  
	
	JButton b = new JButton("click");  
	 
	
    Simple1() {            
	
		b.setBounds(30,20,80, 40);		//Sets position and size of the button inside Frame
		f.add(b);  
				  
		f.setSize(400,500);  
		f.setLayout(null);  
		f.setVisible(true);  
		
	}  
      
    public static void main(String[] args) {  
		new Simple1();  
    }  
	
}