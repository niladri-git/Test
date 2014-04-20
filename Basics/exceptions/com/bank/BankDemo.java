package com.bank;

public class BankDemo {

   public static void main(String [] args) {
   
      CheckingAccount c = new CheckingAccount(101);
	  double deposit = 500.00;
	  double[] withdrawl = { 100.00, 200.00, 300.00, 200, 100 };
	  
      System.out.println("Depositing $" + deposit + "...");
      c.deposit(deposit);
	   
	  for(int i=0; i < withdrawl.length; i++) {
	  
		try {
			
			Thread.sleep(1000);
			System.out.println("\nWithdrawing $" + withdrawl[i] + "...");
			c.withdraw(withdrawl[i]);
			
		} catch(InsufficientFundsException e) {
			 System.out.println("Sorry, but you are short $" + e.getAmount());
			 // catch user defined Exception
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block for Thread.sleep()
			e.printStackTrace();
		} catch (Exception e) {
				  System.out.println(e);
			// catch ALL Exception
		}
		
	  }
	}   
}