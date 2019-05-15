import javax.swing.JOptionPane;
public class MagicDates {

	public static void main(String[] args) {
		
		int userMonth;
		int userDay;
		int userYear;
		
		
		
		
		String userOutputString = JOptionPane.showInputDialog("Please enter the month in numeric form: ");
		userMonth = Integer.parseInt( userOutputString);
		
		String userOutputString2 = JOptionPane.showInputDialog("Please enter the day in numeric form: ");
		userDay = Integer.parseInt( userOutputString2);
		
		String userOutputString3 = JOptionPane.showInputDialog("Please enter the year in two digit form: ");
		userYear = Integer.parseInt( userOutputString3);
		
		if(userMonth*userDay == userYear) {
			
			JOptionPane.showMessageDialog(null, "The date is magic!");
		}
		else {
			JOptionPane.showMessageDialog(null,"The date is not magic!");
		}
		System.exit(0);

	}

}

/*
The date June 10, 1960, is special because when we write it in the following format, the month times the day equals the year:

6/10/60

Write a program that asks the user to enter a month (in numeric form), a day, and a two digit year. The program should then determine whether the month times the day is equal to the year. If so, it should display a message saying the date is magic. Otherwise, it should display a message saying the date is not magic.

Gaddis, Tony (2015-05-29). Starting Out with Java: From Control Structures through Objects (Page 184 and 185). Pearson Education. Kindle Edition.
*/