package exceptionFiles;

import java.util.Scanner;

public class PaymentApp {

	public static void main(String[] args) {
		double payment = 0;
		boolean positivePayment = true;
		
		do {
		// 1.  Ask for input
				System.out.print("Enter Amount : ");
				
		// 2. get the amount and test the value
				Scanner a =new Scanner(System.in);
		
		// 3. check for exceptions
				try {
						payment = a.nextDouble();
						if(payment <=0) {
							throw new negativePaymentException(payment);
						}
						else {
							positivePayment = true;						
						}
					}
				catch(negativePaymentException e) {
						System.out.println(e.toString());
						System.out.println("Please try again.");
						positivePayment = false;
				}
		}while(!positivePayment);
		
		// 4. print confirmation
		System.out.println("Thanks for paying Rs "+payment);
	}

}
