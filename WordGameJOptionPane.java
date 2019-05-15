import javax.swing.JOptionPane;
public class WordGameJOptionPane {

	public static void main(String[] args) {
		
		String name;
		String age; 
		String city; 
		String college; 
		String profession;
		String animal;
		String petName;
		
		name = JOptionPane.showInputDialog("Please enter your name: ");
		age = JOptionPane.showInputDialog("Please enter your age: ");
		city = JOptionPane.showInputDialog("Please enter your city: ");
		college = JOptionPane.showInputDialog("Please enter your college: ");
		profession = JOptionPane.showInputDialog("Please enter your profession: ");
		animal = JOptionPane.showInputDialog("Please enter animal type: ");
		petName = JOptionPane.showInputDialog("Please enter your pet's name: ");
		
		JOptionPane.showMessageDialog(null, "There once was a person named " + name + " who lived in " + city + ". At the age of " + age + ",\n" + name + " went to college at " + college + ". " + name + " graduated and went to work as a\n" + profession + ". Then, " + name + " adopted a(n) " + animal + " named " + petName + ". They both lived\nhappily ever after!");
		
		System.exit(0);
		
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