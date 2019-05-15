import java.util.Scanner;
public class RomanNumerals {

	public static void main(String[] args) {
		
		
		int userNumber;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number from 1 to 10:");
		userNumber = scanner.nextInt();
		
		
		if (userNumber < 1 || userNumber > 10) {
			
			System.out.println("Please run the program again and enter the number from 1 to 10");
			
		}
		else {
			
			if(userNumber == 1) {
				System.out.println(userNumber + " in roman numerals is I");
			}
			else if(userNumber == 2) {
				System.out.println(userNumber + " in roman numerals is II");
			}
			else if(userNumber == 3) {
				System.out.println(userNumber + " in roman numerals is III");
			}
			else if(userNumber == 4) {
				System.out.println(userNumber + " in roman numerals is IV");
			}
			else if(userNumber == 5) {
				System.out.println(userNumber + " in roman numerals is V");	
			}
			else if(userNumber == 6) {
				System.out.println(userNumber + " in roman numerals is VI");
			}
			else if(userNumber == 7) {
				System.out.println(userNumber + " in roman numerals is VII");
			}
			else if(userNumber == 8) {
				System.out.println(userNumber + " in roman numerals is VIII");
			}
			else if(userNumber == 9) {
				System.out.println(userNumber + " in roman numerals is IX");
			}
			else if(userNumber == 10) {
				System.out.println(userNumber + " in roman numerals is X");
			}
		}
		scanner.close();

	}

}

/*
Write a program that prompts the user to enter a number within the range of 1 through 10. The program should display the Roman numeral version of that number. If the number is outside the range of 1 through 10, the program should display an error message.

Gaddis, Tony (2015-05-29). Starting Out with Java: From Control Structures through Objects (Page 184). Pearson Education.
Kindle Edition.
*/