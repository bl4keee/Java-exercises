
public class EnergyDrinkConsumption {

	public static void main(String[] args) {
		
		double peopleSurveyed = 12467;
		double peopleOneDrink;
		double peopleCitrus;
		
		peopleOneDrink = 0.14 * peopleSurveyed;
		peopleCitrus = 0.64 * peopleOneDrink;
		
		System.out.println("The amount of people surveyed is: " + (int)peopleSurveyed);
		System.out.println("The approximate number of customers in the survey who purchase one or more energy drinks per week is: " + (int)peopleOneDrink);
		System.out.println("The approximate number of customers in the survey who prefer citrus-flavored energy drinks is: " + (int)peopleCitrus);
		
		
		
		
		
		
		
		
		
		
	}

}




/*
A soft drink company recently surveyed 12,467 of its customers and found that approximately 14 percent of those surveyed purchase one or more energy drinks per week. Of those customers who purchase energy drinks, approximately 64 percent of them prefer citrusflavored energy drinks. Write a program that displays the following:
•  The approximate number of customers in the survey who purchase one or more energy drinks per week
•  The approximate number of customers in the survey who prefer citrus-flavored energy drinks

Gaddis, Tony (2015-05-29). Starting Out with Java: From Control Structures through Objects (6th Edition) (Page 107-108). Pearson. Kindle Edition. 
*/