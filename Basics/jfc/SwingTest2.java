import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingTest2 extends JFrame implements ActionListener {

	JPanel mypanel;
	JButton mybutton;
	JLabel mylabel;
	
	public SwingTest2() {
	
		mypanel = new JPanel();
		
		mybutton = new JButton("OK");
		
		//For every button or other control that you have created, invoke its method .addActionListener, passing your frame (this) as parameter. 
		mybutton.addActionListener(this);			
		
		mylabel = new JLabel();
		
		mypanel.add(mybutton);
		mypanel.add(mylabel);
		
		this.add(mypanel);		//add the final panel the "holds all" to the frame (myFrame.getContentPane().add(myLargePanel, BorderLayout.Center).
		
	}
	
	//Override ActionListener's abstract method, actionPerformed(ActionEvent event).
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == mybutton) {
			mylabel.setText("My button Clicked");
		}
	}
	
	//Main function
	public static void main(String args[]) {
	
		SwingTest2 myframe = new SwingTest2();
		
		myframe.setTitle("SwingTest2 Example");
		myframe.setSize(300, 200);
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setVisible(true);
		
	}
	
}