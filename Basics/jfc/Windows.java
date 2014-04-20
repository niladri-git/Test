import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Windows extends JFrame {
	
	JWindow win1, win2;
	
	public Windows() {
	
		setTitle("JWindow Example");
		
		JPanel contentpane = (JPanel)getContentPane();
		
		win1 = new JWindow(this);
		win1.setBounds(25, 25, 100, 100);
		
		JButton btn = new JButton("Hello");
		
		JPanel winpane = (JPanel)win1.getContentPane();
		winpane.setBackground(Color.black);
		winpane.setLayout(new BorderLayout());
		winpane.add("South", btn);
		
		win1.setVisible(true);
		
		myAdapter myapp = new myAdapter();
		addWindowListener(myapp);
		
	}
	
	class myAdapter extends WindowAdapter {
	
		public void WindowClosing(WindowEvent e) {
			System.exit(0);
		}
		
	}
	
	public static void main(String args[]) {
	
		Windows win = new Windows();
		
		win.setSize(250, 250);
		win.setVisible(true);
		
	}
}
		