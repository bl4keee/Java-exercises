import java.util.Scanner;
public class BodyMassIndex {

	public static void main(String[] args) {
		
		double userWeight;
		double userHeight;
		double bmi;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your weight in pounds:");
		userWeight = scanner.nextDouble();
		System.out.println("Please enter your height in inches: ");
		userHeight = scanner.nextDouble();
		
		bmi = (userWeight * 703)/ (userHeight*userHeight);

		if(bmi < 18.5) {
			System.out.println("You are considered underweight.");
		}
		else if(bmi < 26) {
			System.out.println("You are considered optimal weight.");
		}
		else {
			System.out.println("You are considered overweight.");
		}
		scanner.close();
		}
		
		
	}




/*
Write a program that calculates and displays a person’s body mass index (BMI). The BMI is often used to determine whether a person with a sedentary lifestyle is overweight or underweight for his or her height. A person’s BMI is calculated with the following formula: 

BMI = Weight x 703 / Height (squared)

where weight is measured in pounds and height is measured in inches. The program should display a message indicating whether the person has optimal weight, is underweight, or is overweight. A sedentary person’s weight is considered optimal if his or her BMI is between 18.5 and 25. If the BMI is less than 18.5, the person is considered underweight. If the BMI value is greater than 25, the person is considered overweight.

Gaddis, Tony (2015-05-29). Starting Out with Java: From Control Structures through Objects (Page 185). Pearson Education. 
Kindle Edition.
*/