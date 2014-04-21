import javax.swing.*;

public class SwingTest1 extends JFrame {

	JPanel mypanel;
	JButton mybutton;
	JLabel mylabel;
	
	public SwingTest1() {
	
		mypanel = new JPanel();
		mybutton = new JButton("OK");
		mylabel = new JLabel();
		
		mypanel.add(mybutton);
		mypanel.add(mylabel);
		
		this.add(mypanel);		//add the final panel the "holds all" to the frame (myFrame.getContentPane().add(myLargePanel, BorderLayout.Center).
		
	}
	
	public static void main(String args[]) {
	
		SwingTest1 myframe = new SwingTest1();
		
		myframe.setTitle("SwingTest1 Example");
		myframe.setSize(300, 200);
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setVisible(true);
		
	}
	
}