import java.io.*;

public class IOMain {

	public static void main(String args[]) {	
	
		IOTest io = new IOTest();
		
		try {
			io.copyCharacters();   
		} catch (IOException err) {
               System.out.println("Error");
		}
		
	}
	
}