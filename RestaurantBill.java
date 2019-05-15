import java.util.Scanner;
public class RestaurantBill {

	public static void main(String[] args) {
		
		double mealCost;
		double tax;
		double totalCost;
		double tip;
		double totalBill; 
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the cost of the meal: ");
		mealCost = scanner.nextDouble();
		scanner.close();
		
		tax = mealCost * 0.0675;
		totalCost = mealCost + tax;
		tip = totalCost * 0.2;
		totalBill = totalCost + tip;
		
		System.out.println("Cost of the meal: $" + mealCost);
		System.out.println("Tax: $" + tax);
		System.out.println("Tip: $" + tip);
		System.out.println("Total bill: $" + totalBill);
		
		
		
		
	}

}



/*
Write a program that computes the tax and tip on a restaurant bill. The program should ask the user to enter the charge for the meal. The tax should be 6.75 percent of the meal charge. The tip should be 20 percent of the total after adding the tax. Display the meal charge, tax amount, tip amount, and total bill on the screen.

Gaddis, Tony (2015-05-29). Starting Out with Java: From Control Structures through Objects (6th Edition) (Page 107). Pearson. Kindle Edition. 
*/