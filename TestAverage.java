import java.util.Scanner;
public class TestAverage {

	public static void main(String[] args) {
		
		double firstScore;
		double secondScore;
		double thirdScore;
		double average;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter first score:");
		firstScore = scanner.nextDouble();
		System.out.println("Please enter second score:");
		secondScore = scanner.nextDouble();
		System.out.println("Please enter third score:");
		thirdScore = scanner.nextDouble();
		scanner.close();
		
		average = (firstScore + secondScore + thirdScore)/3;
		
		System.out.println("The average of " + firstScore + "," + secondScore + " and " + thirdScore + " is " + average);
	}

}


/*
Write a program that asks the user to enter three test scores. The program should display each test score, as well as the average of the scores.

Gaddis, Tony (2015-05-29). Starting Out with Java: From Control Structures through Objects (6th Edition) (Page 107). Pearson. Kindle Edition. 
*/