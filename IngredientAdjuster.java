import java.util.Scanner;
public class IngredientAdjuster {

	public static void main(String[] args) {
		
		
		
		double cupsOfSugarPerCookie = 1.5/48; 
		double cupsOfButterPerCookie = 1/48; 
		double cupsOfFlourPerCookie = 2.75/48;
		int userNumberOfCookies; 
		
		double expectedCupsOfSugar;
		double expectedCupsOfButter;
		double expectedCupsOfFlour;
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter the amount of cookies you want to make: ");
		userNumberOfCookies = scanner.nextInt();
		scanner.close();
		
		expectedCupsOfSugar = userNumberOfCookies * cupsOfSugarPerCookie;
		expectedCupsOfButter = (double)userNumberOfCookies * (double)cupsOfButterPerCookie;
		expectedCupsOfFlour = userNumberOfCookies * cupsOfFlourPerCookie;
		
		System.out.println("The cups of sugar needed: " + expectedCupsOfSugar);
		System.out.println("The cups of butter needed: " + expectedCupsOfButter);
		System.out.println("The cups of flour needed: " + expectedCupsOfFlour);
		
		
		
		
		
		
		
	}

}


/*
A cookie recipe calls for the following ingredients: 
•  1.5 cups of sugar 
•  1 cup of butter 
•  2.75 cups of flour 
The recipe produces 48 cookies with these amounts of the ingredients. Write a program that asks the user how many cookies
he or she wants to make, and then displays the number of cups of each ingredient needed for the specified number of cookies.

Gaddis, Tony (2015-05-29). Starting Out with Java: From Control Structures through Objects (6th Edition) (Page 108). Pearson.
Kindle Edition.
*/