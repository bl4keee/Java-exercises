import java.util.Scanner;

public class SalesTax {

	public static void main(String[] args) {
		
		final double State_sales_tax_percentage = 0.04;
		final double County_sales_tax_percentage = 0.02;
		double PurchaseAmount; 
		double CountyTax; 
		double StateTax; 
		double TotalTax;
		double TotalSale;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the purchase amount: ");
		PurchaseAmount = scanner.nextDouble();
		scanner.close();
		
		CountyTax = PurchaseAmount * County_sales_tax_percentage;
		StateTax = PurchaseAmount * State_sales_tax_percentage;
		TotalTax = CountyTax + StateTax;
		TotalSale = PurchaseAmount + TotalTax;
		
		System.out.println("Purchase Amount: $" +PurchaseAmount);
		System.out.println("County Sales Tax: $" + CountyTax);
		System.out.println("State Sales Tax: $" + StateTax);
		System.out.println("Total Sales Tax: $" + TotalTax);
		System.out.println("Total Sale: $" + TotalSale);
		
				
		
		
		
		
		
		}

	}


