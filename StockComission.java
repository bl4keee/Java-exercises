import javax.swing.JOptionPane;
public class StockComission {

	public static void main(String[] args) {
		
		int sharesAmount = 600;
		double sharePrice = 21.77;
		double commission = 0.02;
		double amountPaid;
		double amountCommission;
		double totalAmount; 
		
		amountPaid = sharesAmount * sharePrice;
		amountCommission = amountPaid * commission;
		totalAmount = amountPaid + amountCommission;
		
		
		
		JOptionPane.showMessageDialog(null, "Kathryn paid $" + amountPaid + " for the shares. She paid $" + amountCommission + " to her stock broker. Total amount that Kathryn paid is  $" +totalAmount);
		System.exit(0);
	
		
		
		
		
		
		
		
		
	}

}


/*
Kathryn bought 600 shares of stock at a price of $21.77 per share. She must pay her stockbroker a 2 percent commission for the transaction. Write a program that calculates and displays the following:
•  The amount paid for the stock alone (without the commission)
•  The amount of the commission
•  The total amount paid (for the stock plus the commission)

Gaddis, Tony (2015-05-29). Starting Out with Java: From Control Structures through Objects (6th Edition) (Page 107). Pearson. Kindle Edition. 
*/