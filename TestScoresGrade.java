import java.util.Scanner;
public class TestScoresGrade {

	public static void main(String[] args) {
		
		double score1;
		double score2;
		double score3;
		double average;
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter first score:");
		score1 = scanner.nextDouble();
		
		System.out.println("Please enter the second score:");
		score2 = scanner.nextDouble();
		
		System.out.println("Please enter the third score:");
		score3 = scanner.nextDouble();
		
		average = (score1 + score2 + score3)/3;
		
		if(average < 60) {
			System.out.printf("Your test score average is: %.0f. Your letter grade is F.", average);
		}
		else if(average < 70) {
			System.out.printf("Your test score average is: %.0f. Your letter grade is D.", average);
		}
		else if(average < 80) {
			System.out.printf("Your test score average is: %.0f. Your letter grade is C.", average);
		}
		else if(average < 90) {
			System.out.printf("Your test score average is: %.0f. Your letter grade is B.", average);
		}
		else if(average <= 100) {
			System.out.printf("Your test score average is: %.0f. Your letter grade is A.", average);
		}
		else {
			System.out.println("Your test score average is: " + average + ". That's an invalid average.");
		}
		scanner.close();
		
		
		

	}

}

/*
Write a program that has variables to hold three test scores. The program should ask the user to enter three test scores and then assign the values entered to the variables. The program should display the average of the test scores and the letter grade that is assigned for  the test score average. Use the grading scheme in the following table: 

Test Score Average      Letter Grade 
         90–100                           A 
         80–89                             B 
         70–79                             C 
         60–69                             D 
         Below 60                        F

Gaddis, Tony (2015-05-29). Starting Out with Java: From Control Structures through Objects (Page 185). Pearson Education. Kindle Edition.

*/