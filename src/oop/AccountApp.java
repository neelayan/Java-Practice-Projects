package oop;

public class AccountApp {

	public static void main(String[] args) {
		LoanAccount LA1 = new LoanAccount();
		LA1.setRate();
		LA1.increaseRate();
		LA1.setTerm(10);
		LA1.setAmortSchedule();
		
		IRate AC1 = new LoanAccount();
		AC1.increaseRate();


	}

}
