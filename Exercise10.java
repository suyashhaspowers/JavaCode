import java.util.*;

public class Exercise10 {

	public static void main(String[] args) {
		// Add Scanner Keyboard
		Scanner keyboard = new Scanner(System.in);
		// Display Message: Ask for date of birth. Convert String answers to Int
		System.out.println("Enter your birthdate: ");
		System.out.println("Year: ");
		String year = keyboard.nextLine();
		int year1 = Integer.parseInt(year);
		System.out.println("Month: ");
		String month = keyboard.nextLine();
		int month1 = Integer.parseInt(month);
		System.out.println("Day: ");
		String day = keyboard.nextLine();
		int day1 = Integer.parseInt(day);
		
		//Today's Date: Ask for today's date. Convert String answers to Int
		System.out.println("Enter today's date: ");
		System.out.println("Year: ");
		String yearPresent = keyboard.nextLine();
		int year2 = Integer.parseInt(yearPresent);
		System.out.println("Month: ");
		String monthPresent = keyboard.nextLine();
		int month2 = Integer.parseInt(monthPresent);
		System.out.println("Day: ");
		String dayPresent = keyboard.nextLine();
		int day2 = Integer.parseInt(dayPresent);
		
		// Days Alive. Subtract day of birth from 30.
		int datePartOne = 30 - day1;
		// Months Alive. Subtract day of birth from 12 months from year of birth
		int datePartTwo = 12 - month1;
		int dateMonth = datePartTwo * 30;
		// Subtract year of birth from today's year
		int datePartThree = year2 - year1;
		int years = datePartThree * 365;
		// Days Alive FINAL
		int alive = datePartOne + years + dateMonth;
		
		//Sleep
		int sleep = alive*8;
		
		// Print Days Alive and Time Spent Sleeping      
		System.out.println("You have been alive for: "+ alive +" days.");
		System.out.println("You have slept for "+ sleep + " hours of your life.");

	}

}
