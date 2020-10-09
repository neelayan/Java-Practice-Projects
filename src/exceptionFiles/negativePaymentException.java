package exceptionFiles;

public class negativePaymentException extends Exception{
	double amount;
	
	//constructor
	public negativePaymentException(double amount) {
		 this.amount = amount;
	}
	
	public String toString() {
		return "Error : Cannot make negative payment of Rs "+amount;
	}

}