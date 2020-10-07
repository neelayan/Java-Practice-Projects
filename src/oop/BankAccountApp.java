package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount BA1 = new BankAccount();
		//BA1.accNumber = Math.random();
		BA1.accNumber = 861124;
		//BA1.name = "John Doe";
		BA1.setName("John Doe");
		System.out.println(" Name	: "+BA1.getName());
		
		BA1.setPAN("FIG2363FGQ");
		System.out.println(" PAN	: "+BA1.getPAN());
		
		BA1.balance = 60000;
		System.out.println(BA1.toString());
		BA1.deposit(5000);
		BA1.deposit(5500);
		BA1.withdraw(7000);
		BA1.setRate();
		BA1.increaseRate();
		
		
		//LoanAccount LA1 = new LoanAccount();
		//LA1.setRate();
		/*
		//BA1.routingNumber = Math.random(); (Not possible as variable is made final)
		
		//Method Overloading
		BankAccount BA2 = new BankAccount("CHECKING...");
		BA2.accNumber = Math.random();
		
		//static & final
		System.out.println("Routing Number : "+BA1.routingNumber);
		//System.out.println("Routing Number 2 : "+BA2.routingNumber);
		//System.out.println("Routing Number 3 : "+BA3.routingNumber);
		
		
		BankAccount BA3 = new BankAccount("Savings.",10000);
		BA3.accNumber = Math.random();
		BA3.checkBalance();
		*/
		/*
		CDAccount CD1 = new CDAccount();
		CD1.accNumber = Math.random();
		CD1.name = "Peter Crouch";
		CD1.balance = 50000;
		CD1.interestRate = 7;
		System.out.println(CD1.toString());
		*/


	}

}
