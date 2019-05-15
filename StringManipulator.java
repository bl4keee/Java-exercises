import java.util.Scanner;
public class StringManipulator {

	public static void main(String[] args) {
		
		String userFavouriteCity;
		
					
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the name of your favourite city: ");
		userFavouriteCity = scanner.nextLine();
		scanner.close();
		
		
		System.out.println("The number of characters in the city name " + userFavouriteCity + " is: " + userFavouriteCity.length());
		System.out.println("The name of the city in all uppercase letters is: " + userFavouriteCity.toUpperCase());
		System.out.println("The name of the city in all lowercase letters is: " + userFavouriteCity.toLowerCase());
		System.out.println("The first character in the name of the city " + userFavouriteCity + " is: " + userFavouriteCity.charAt(0));
		
		
		
	}

}



/*
Write a program that asks the user to enter the name of his or her favorite city. Use a String variable to store the input. The program should display the following:

•  The number of characters in the city name
•  The name of the city in all uppercase letters
•  The name of the city in all lowercase letters
•  The first character in the name of the city

Gaddis, Tony (2015-05-29). Starting Out with Java: From Control Structures through Objects (6th Edition) (Page 107). Pearson. Kindle Edition. 
*/