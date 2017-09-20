import java.util.*;

public class CaseStudy {

	public static void main(String[] args) {
		
		System.out.println("Using paper and pencil perform the following calculations:\n");
		System.out.println("1. Determine your birthday month by (Jan = 1 etc.)");
		System.out.println("2. Multiply that number by 5.");
		System.out.println("3. Add 6 to that number");
		System.out.println("4. Multiply the number by 4.");
		System.out.println("5. Add 9 to the number.");
		System.out.println("6. Multiply that number by 5.");
		System.out.println("7. Add your birth day to number (10 if the 10th and so on).\n");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your number: ");
		String number = keyboard.nextLine();
		int intanswer = Integer.parseInt(number);
		int birthday = (intanswer-165)%100;
		int birthmonth = (intanswer-165)/100;
		System.out.println("Your birthday is: " + birthmonth + "/" + birthday);
	}

}
