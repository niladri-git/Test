package com.bank;

public class BankDemo {

   public static void main(String [] args) {
   
      CheckingAccount c = new CheckingAccount(101);
	  
      System.out.println("Depositing $500...");
      c.deposit(500.00);
	  
	  try {
	  
		System.out.println("\nWithdrawing $100...");
		c.withdraw(100.00);
		Thread.sleep(1000);
		
		System.out.println("\nWithdrawing $600...");
		c.withdraw(600.00);
		
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