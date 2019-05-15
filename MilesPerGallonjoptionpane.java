import javax.swing.JOptionPane;

public class MilesPerGallonjoptionpane {

	public static void main(String[] args) {
		
		
		String userStringOutput;
		double userMiles;
		double userGallons;
		double MilesPerGallon;
		
		userStringOutput = JOptionPane.showInputDialog("Please enter the number of miles driven: " );
		userMiles = Double.parseDouble( userStringOutput );
		
		userStringOutput = JOptionPane.showInputDialog("Please enter the gallons of gas used: " );
		userGallons = Double.parseDouble ( userStringOutput );
		
		MilesPerGallon = userMiles / userGallons;
		
		JOptionPane.showMessageDialog(null, "Miles per gallon: " + MilesPerGallon);
		System.exit( 0 );
		
		
		
		
		
		/*Scanner scanner  = new Scanner(System.in);
		System.out.println("Please enter the number of miles driven: ");
		userMiles = scanner.nextDouble();
		
		System.out.println("Please enter the gallons of gas used: ");
		userGallons = scanner.nextDouble();
		
		MilesPerGallon = userMiles/userGallons;
		System.out.println("Miles per gallon: " + MilesPerGallon);
		
		scanner.close();
		
		
		*/
		
		

	}

}




/*
A car’s miles-per-gallon (MPG) can be calculated with the following formula:
MPG = Miles driven / Gallons of gas used
Write a program that asks the user for the number of miles driven and the gallons of gas used. It should calculate the car’s miles-per-gallon and display the result on the screen.

Gaddis, Tony (2015-05-29). Starting Out with Java: From Control Structures through Objects (6th Edition) (Page 106 - 107). Pearson. Kindle Edition. 
*/