import java.util.Scanner;

class ScannerTest {

	public static void main(String args[]) {

	System.out.println("Enter your username: ");
    Scanner scanner = new Scanner(System.in);
    String username = scanner.nextLine();
    System.out.println("Your username is " + username);

/*
	Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
	
	System.out.println("You Entered: " + i);
*/
	}	
}