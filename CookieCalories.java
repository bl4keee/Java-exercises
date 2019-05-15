import javax.swing.JOptionPane;
public class CookieCalories {

	public static void main(String[] args) {
		
	String userStringOutput;
	double userNumberOfCookies;
	double userNumberOfServings;
	double userNumberOfCalories;
	
	
	userStringOutput = JOptionPane.showInputDialog("Please enter the number of cookies" );
	userNumberOfCookies = Double.parseDouble( userStringOutput );
	userNumberOfServings = (userNumberOfCookies / 40) * 10;
	userNumberOfCalories = (userNumberOfServings / 1)* 300;
	
	JOptionPane.showMessageDialog(null, userNumberOfCookies + " cookies are equal to " + userNumberOfCalories + " calories " + "(" + userNumberOfServings + " servings" + ")");

	System.exit( 0 );
	}

}




/*
 A bag of cookies holds 40 cookies. The calorie information on the bag claims that there are 10 servings in the bag and that a serving equals 300 calories. Write a program that lets the user enter the number of cookies he or she actually ate and then reports the number of total calories consumed.
Gaddis, Tony (2015-05-29). Starting Out with Java: From Control Structures through Objects (6th Edition) (Page 106). Pearson. Kindle Edition. 

Notes: 
Cookies to servings: 
40 cookies = 10 servings
20 cookie = ?

Servings to calories: 
1 serving = 300 calories
0.5 serving = ?
 
 
*/