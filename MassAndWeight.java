import java.util.Scanner;
public class MassAndWeight {

	public static void main(String[] args) {
		
		double mass;
		double weight;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the object's mass: ");
		mass = scanner.nextDouble();
		scanner.close();

		weight = mass * 9.8;
		
		if (weight > 1000) {
			System.out.printf("The object weighing %.1f Newtons is too heavy!", weight);
		}
		else if (weight < 10) {
			System.out.printf("The object weighing %.1f Newtons is too light!", weight);
		}
		else {
			System.out.printf("The object weighing %.1f Newtons is not too heavy nor light.", weight);
		}
		
	}

}


/*
Scientists measure an object’s mass in kilograms and its weight in Newtons. If you know the amount of mass that an object has, you can calculate its weight, in Newtons, with the following formula: 

Weight = Mass x 9.8

Write a program that asks the user to enter an object’s mass, and then calculate its weight. If the object weighs more than 1,000 Newtons, display a message indicating that it is too heavy. If the object weighs less than 10 Newtons, display a message indicating that the object is too light.

Gaddis, Tony (2015-05-29). Starting Out with Java: From Control Structures through Objects (Page 185). Pearson Education. 
Kindle Edition. 

*/