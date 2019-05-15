public class NameAgeIncome {

	public static void main(String[] args) {
		
		String name = "Jacek Kowalski";
		int age = 19;
		double annualPay = 10000;

		System.out.println("My name is " + name + ", my age is " + age + " and");
		System.out.println("I hope to earn $"+annualPay + " per month.");	
		//inna opcja - System.out.println("My name is " + name + ", my age is " + age + " and \nI hope to earn $"+annualPay + " per month."); 
	}
}

/*
1. Name, age, and annual income 

Write a program that declares the following: 
    •  a String variable named name 
    •  an int variable named age 
    •  a double variable named annualPay 
Store your age, name, and desired annual income as literals in these variables. The program should display these values on the screen in a manner 
similar to the following: 

My name is Joe Mahoney, my age is 26 and 
I hope to earn $100000.0 per year.
*/