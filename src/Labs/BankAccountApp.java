package Labs;

public class BankAccountApp {

		public static void main(String[] args) {
		
		BankAccount	BA1 = new BankAccount("W9W8RCSSO9" , 6000);
		//BankAccount	BA2 = new BankAccount("KBWCMVV1QG");
		//BankAccount	BA3 = new BankAccount("JQQW9B9ZSM");
		
		BA1.setName("Eric Lamela");
		System.out.println("Name : "+BA1.getName());
		//BA1.deposit(500.501);
		//BA1.deposit(600.45);
		//BA1.withdraw(1000);
		BA1.interest();
		System.out.println(BA1.toString());
		}
}
	
	class BankAccount implements IInterest{
		//properties
		private static int ID = 1000;		//internal ID
		private String accountNumber;
		private static final String routingNumber = "056917";
		private String PAN;
		private String name;
		private double balance;
		
		//Constructor
		public BankAccount(String PAN , double initDeposit) {
			//System.out.println("New account created.");
			this.PAN = PAN;
			ID++;
			balance = balance+initDeposit;
			
			setAccountNumber();				//ID + random 2-didgit number + first 2 of PAN
		}
		
		private void setAccountNumber() {
			accountNumber = ""+ID +""+(int) (Math.random()*100)+""+PAN.substring(0, 2);
			System.out.println("ACCOUNT NUMBER : "+accountNumber);
			//System.out.println((int) (Math.random()*1000));
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
		public void deposit(double amount) {
			balance= balance + amount;
			System.out.println("Deposit : Rs "+amount);
			showBalance();
		}
		
		public void withdraw(double amount) {
			balance = balance - amount;
			System.out.println("Withdraw : Rs "+amount);
			showBalance();
		}
		
		public void showBalance() {
			System.out.println("Balance : Rs "+balance);
		}
		
		public void interest() {
			balance = balance *(1+ (rate/100));
			System.out.println("Final Balance ");
			showBalance();
		}
		public String toString() {
			return "[ Name : "+name+"]\n[ Account Number : #"+accountNumber+"]\n[ Routing Number : #"+routingNumber+"]\n[ Balance : Rs "+balance+" ]";
		}
	}
