import javax.swing.JOptionPane;
public class MaleFemalePercentages {

	public static void main(String[] args) {
		
		
	
		int userNumberOfMales;
		int userNumberOfFemales;
		int totalNumberOfStudents;
		double malePercentage; 
		double femalePercentage; 
		
		
		String userOutputString = JOptionPane.showInputDialog("Please enter the number of males in the class: ");
		userNumberOfMales = Integer.parseInt( userOutputString);
		
		String userOutputString2 = JOptionPane.showInputDialog("Please enter the number of females in the class: ");
		userNumberOfFemales = Integer.parseInt( userOutputString2);
		
		totalNumberOfStudents = userNumberOfMales + userNumberOfFemales;
		
		malePercentage = ( (double) userNumberOfMales / totalNumberOfStudents )* 100; 
		femalePercentage = ( (double) userNumberOfFemales / totalNumberOfStudents )* 100;
		
		JOptionPane.showMessageDialog(null, "There are " + totalNumberOfStudents + " students in the class. " + malePercentage + "% of the class are males. " + femalePercentage + "% of the class are females.");
		
		System.exit(0);
		
		
		
		
		
		

	}

}


/*
Write a program that asks the user for the number of males and the number of females registered in a class. The program should display the percentage of males and females in the class. Hint: Suppose there are 8 males and 12 females in a class. There are 20 students in the class. The percentage of males can be calculated as 8 / 20 = 0.4, or 40%. The percentage of females can be calculated as 12 / 20 5 = 0.6, or 60%.
*/