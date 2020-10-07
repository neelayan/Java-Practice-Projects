package oop;

public class BankAccount implements IRate {
	//Declare variables
	
	//static & final variable
	//private static final double routingNumber = Math.random();
	private static final long routingNumber = 477925;
	//instance variables
	long accNumber;
	double balance;
	String accType;
	private String name;
	private String PAN;
	
	//Constructor
	BankAccount() {
		System.out.println("Account Created....");
	}
	
	BankAccount(String accType) {
		System.out.println("Account Type : "+accType);
	}
	
	//local variables
	BankAccount(String accType , double initDeposit) {
		System.out.println("Account Type : "+accType);
		System.out.println("Initial Deposit (Rs) : "+initDeposit);
		String Msg;
		if(initDeposit < 1000) {
			Msg = "ERROR : Minimum value is Rs 1000";
		}
		else {
			Msg = "Thanks for the deposit of Rs "+ initDeposit;
			balance = balance + initDeposit;
			
		}
		System.out.println(Msg);
	}
	
	//Define methods
	void withdraw(double amount) {
		balance = balance - amount; 
		showActivity("WITHDRAW");
	}
	void deposit(double amount) {
		balance = balance + amount; 
		showActivity("DEPOSIT");
	}
	void checkBalance() {
		System.out.println("BALANCE : Rs "+balance);
		
	}
	void getStatus() {
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return "Mr. " + name;
	}
	public String getPAN() {
		return PAN;
	}
	public void setPAN(String pAN) {
		PAN = pAN;
	}

	public String toString() {
		return "[ Name : "+name + " | Account Number #"+ accNumber + " | Routing Number #"+ routingNumber +" | Balance : Rs "+balance+ "]";
		
	}
	
	public void setRate() {
		System.out.println("Setting Rate...");
	}
	public void increaseRate() {
		System.out.println("Increasing Rate...");
	}
	
	private void showActivity(String Activity) {
		System.out.println("Action Performed : "+Activity);
		System.out.println("NEW BALANCE : Rs "+balance);
		//System.out.println(toString());

		
	}

}
