import java.util.*;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter the diameter of the pizza you wish to purchase: ");
		String size = keyboard.nextLine();
		double answer = Double.parseDouble(size);
		double price = 0.75 + 1.00 + ((answer*answer)*0.05);
		System.out.println("The cost of making the pizza is: $"+price);
	}

}
