import javax.swing.JOptionPane;
public class TestScoresGradeJOptionPane {

	public static void main(String[] args) {
		
		
		double userFirstScore;
		double userSecondScore;
		double userThirdScore;
		double userAverage;
		char letterGrade = 'Z';
		String outputString = "";
		
		
		String userInputString = JOptionPane.showInputDialog("Please enter the first score: ");
		userFirstScore = Double.parseDouble( userInputString);
		
		String userInputString2 = JOptionPane.showInputDialog("Please enter the second score: ");
		userSecondScore = Double.parseDouble( userInputString);
		
		String userInputString3 = JOptionPane.showInputDialog("Please enter the third score: ");
		userThirdScore = Double.parseDouble( userInputString);
		
		
		userAverage = ( userFirstScore + userSecondScore + userThirdScore )/3;
		
		if(userAverage < 60) {
			letterGrade = 'F';
		}
		else if(userAverage < 70) {
			letterGrade = 'D';
		}
		else if(userAverage < 80) {
			letterGrade = 'C';
		}
		else if(userAverage < 90) {
			letterGrade = 'B';
		}
		else if(userAverage <= 100) {
			letterGrade = 'A';
		}
		
		outputString = String.format( "The average is %.1f, letter grade %c", userAverage, letterGrade);
		
		JOptionPane.showMessageDialog(null, outputString);
		
		System.exit(0);
		
		
		
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