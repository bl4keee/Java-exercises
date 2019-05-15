import javax.swing.JOptionPane;
public class CircuitBoardProfitJOptionPane {

	public static void main(String[] args) {
		
		double userRetailPrice;
		final double PROFIT_PERCENTAGE = 0.4;
		double companyProfit;
		
		String userOutputString = JOptionPane.showInputDialog("Please enter the retail price of the product: ");
		userRetailPrice = Double.parseDouble( userOutputString);
		
		companyProfit = PROFIT_PERCENTAGE * userRetailPrice;
		
		JOptionPane.showMessageDialog(null, "The profit earned on $" + userRetailPrice + " is $" + companyProfit);
		
		System.exit(0);

	}

}


/*

An electronics company sells circuit boards at a 40 percent profit. If you know the retail price of a circuit board, you can calculate its profit with the following formula: Profit = Retail price × 0.4
Write a program that asks the user for the retail price of a circuit board, calculates the amount of profit earned for that product, and displays the results on the screen.
*/