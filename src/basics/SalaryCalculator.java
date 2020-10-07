package basics;

public class SalaryCalculator {

	public static void main(String[] args) {
		//Create a variable to define career
		//Declare variable
		String career;
		System.out.println("Program is starting...");
		
		//Define variable
		career= "Software Engineer";
		System.out.println("My career is " + career+".");
		
		//Declare and Define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50; 
		career= "Web Developer";
		
		//calculation
		double salary = hoursPerWeek* weeksPerYear* rate;
		System.out.println("My salary per annum is $"+salary +" as "+career);
		
	}

}
