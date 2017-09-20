import java.util.*;

public class Exercise9 {

	public static void main(String[] args) {
		
		// Create a new scanner object for the keyboard
		Scanner keyboard = new Scanner(System.in);
		
		// Message to user
		System.out.println("Enter the time in minutes: ");
		
		// Read user input into a string
		String userInput = keyboard.nextLine();
		// Convert input into an integer
		int time = Integer.parseInt(userInput);
		
		// Find hour
		int hour = time / 60;
		// Find minutes
		int minutes = time % 60;
		
		// Print final time in hours and minutes
		System.out.println("The time is "+hour+":"+minutes);
				
	}

}
