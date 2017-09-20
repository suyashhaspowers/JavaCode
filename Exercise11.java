import java.util.*;

public class Exercise11 {

	public static void main(String[] args) {
		// Insert Scanner for keyboard
		Scanner keyboard = new Scanner(System.in);
		
		// Display questions to user, ask for user input, convert input into INT
		System.out.println("Enter the number of burgers: ");
		String burger1 = keyboard.nextLine();
		double burger2 = Double.parseDouble(burger1);
		System.out.println("Enter the number of fries: ");
		String fries1 = keyboard.nextLine();
		double fries2 = Double.parseDouble(fries1);
		System.out.println("Enter the number of sodas: ");
		String soda1 = keyboard.nextLine();
		double soda2 = Double.parseDouble(soda1);
		
		// Determine costs before tax
		double totalNoTax = (burger2*1.69)+(fries2*1.09)+(soda2*0.99);

		// Display costs without tax
		System.out.println("The total price without taxes is: $"+totalNoTax);
		
		// Tax
		double tax = totalNoTax * 0.065;
		
		// Display tax
		System.out.println("Tax: $"+tax);
		
		//Display total with tax
		double totalTax = (tax+totalNoTax);
		System.out.println("Total: $"+(totalTax));
		
		//Total Money Tendered + change
		System.out.println("Enter amount of money tendered: $");
		String tender = keyboard.nextLine();
		double moneytender = Double.parseDouble(tender);
		
		// Display change
		System.out.println("Change: $"+(moneytender-totalTax));
		
	}

}
