import java.util.*;

public class Exercise6 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a money value less than $5 in cents:");
		
		String money = keyboard.nextLine();
		int toonie1 = Integer.parseInt(money);
		int toonie2 = toonie1/200;
		
		int toonie3 = toonie1%200;
		int loonie1 = toonie3/100;
		
		int loonie2 = toonie3%100;
		int quarter1 = loonie2/25;
		
		int quarter2 = loonie2%25;
		int dime1 = quarter2/10;
		
		int dime2 = quarter2%10;
		int nickel1 = dime2/5;
		
		int nickel2 = dime2%5;
		int penny1 = nickel2/1;
		
		System.out.println("The minimum number of coins is:");
		System.out.println("\t Toonie(s): "+ toonie2);
		System.out.println("\t Loonie(s): "+ loonie1);
		System.out.println("\t Quarter(s): "+ quarter1);
		System.out.println("\t Dime(s): "+ dime1);
		System.out.println("\t Nickel(s): "+ nickel1);
		System.out.println("\t Pennie(s): "+ penny1);

	}

}

