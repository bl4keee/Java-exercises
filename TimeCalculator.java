import java.util.Scanner;
public class TimeCalculator {

	public static void main(String[] args) {
		
	final double secondsInAMinute = 60;
	final double secondsInAnHour = 3600;
	final double secondsInADay = 86400;
	double userSeconds;
	double days = 0;
	double minutes = 0;
	double seconds = 0;
	double hours = 0;
	double remainingSeconds;
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter the number of seconds: ");
	userSeconds = scanner.nextDouble();
	scanner.close();
		

	if (userSeconds >= secondsInADay) {
		days = userSeconds / secondsInADay; 
		remainingSeconds = userSeconds % secondsInADay;
		
		if(remainingSeconds >= secondsInAnHour) {
			hours = remainingSeconds / secondsInAnHour;
			remainingSeconds = remainingSeconds % secondsInAnHour;	
			
			if(remainingSeconds >= secondsInAMinute) {
				minutes = remainingSeconds / secondsInAMinute;
				remainingSeconds = remainingSeconds % secondsInAMinute;
				seconds = remainingSeconds;
			}
			else {
				seconds = remainingSeconds;  
			}
		}
		else if (remainingSeconds >= secondsInAMinute) {
			minutes = remainingSeconds / secondsInAMinute;
			remainingSeconds = remainingSeconds % secondsInAMinute;
			seconds = remainingSeconds; 
		}
		else {
			seconds = remainingSeconds; 
		}
		
	}
	else if (userSeconds >= secondsInAnHour) {
		hours = userSeconds / secondsInAnHour;
		remainingSeconds = userSeconds % secondsInAnHour;
		if(remainingSeconds >= secondsInAMinute) {
			minutes = remainingSeconds / secondsInAMinute;
			remainingSeconds = remainingSeconds % secondsInAMinute;
			seconds = remainingSeconds; 
		}
		else {
			seconds = remainingSeconds; 
		}
	}
	else if (userSeconds >= secondsInAMinute) {
		minutes = userSeconds / secondsInAMinute;
		remainingSeconds = userSeconds % secondsInAMinute;
		seconds = remainingSeconds;
	}
	else {
		seconds = userSeconds;
	}
	System.out.println((int)days + " day(s) " + (int)hours + " hour(s) " + (int)minutes + " minute(s) " + seconds + " second(s)");
	
	
	
	
	
	}

}


/*
Write a program that asks the user to enter a number of seconds. 

•  There are 60 seconds in a minute. If the number of seconds entered by the user is greater than or equal to 60, the program should display the number of minutes in that many seconds.

•  There are 3,600 seconds in an hour. If the number of seconds entered by the user is greater than or equal to 3,600, the program should display the number of hours in that many seconds. 

•  There are 86,400 seconds in a day. If the number of seconds entered by the user is greater than or equal to 86,400, the program should display the number of days in that many seconds.

Gaddis, Tony (2015-05-29). Starting Out with Java: From Control Structures through Objects (Page 185 & 186). Pearson Education. 
Kindle Edition. 
*/