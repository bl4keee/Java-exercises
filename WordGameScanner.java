import java.util.Scanner;
public class WordGameScanner {

	public static void main(String[] args) {
		
		
		String name;
		int age; 
		String city; 
		String college; 
		String profession;
		String animal;
		String petName;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your name:");
		name = scanner.nextLine();
		
		System.out.println("Please enter your age: ");
		age = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Please enter your city: ");
		city = scanner.nextLine();
		
		System.out.println("Please enter your college: ");
		college = scanner.nextLine();
		
		System.out.println("Please enter your profession: ");
		profession = scanner.nextLine();
		
		System.out.println("Please enter type of animal: ");
		animal = scanner.nextLine();
		
		System.out.println("Please enter your pet's name: ");
		petName = scanner.nextLine();
		
		scanner.close();
		
		System.out.println("There once was a person named " + name + " who lived in " + city + ". At the age of " + age + ", " + name + " went to college at " + college + ". " + name + " graduated and went to work as a " + profession + ". Then, " + name + " adopted a(n) " + animal + " named " + petName + ". They both lived happily ever after!");
		
		
		
		
		
		
	}

}


/*
Write a program that plays a word game with the user. The program should ask the user to  
enter the following: 

•  His or her name 
•  His or her age 
•  The name of a city 
•  The name of a college 
•  A profession 
•  A type of animal 
•  A pet’s name 

After the user has entered these items, the program should display the following story,  
inserting the user’s input into the appropriate locations: 

There once was a person named NAME who lived in CITY. At the age of AGE, NAME went to college at COLLEGE. NAME graduated and went to work as a PROFESSION. Then, NAME adopted a(n) ANIMAL named PETNAME. They both lived happily ever after!

Gaddis, Tony (2015-05-29). Starting Out with Java: From Control Structures through Objects (6th Edition) (Page 108 and 109). Pearson.
Kindle Edition.
 
*/