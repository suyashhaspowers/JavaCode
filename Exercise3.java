import java.util.*;

public class Exercise3 {

	public static void main(String[] args) {
		/* The average cost for tuition is $6000 */
		/* The average cost for books are $1000 */
		/* The average cost for rent is $5000*/
		Scanner keyboard = new Scanner (System.in);
		System.out.println("What is your offset cost for the first year of University?: ");
		String offset = keyboard.nextLine();
		int intoffset = Integer.parseInt(offset);
		int finalcost = 12000-intoffset;
		System.out.println("The final cost for first year University is: $"+finalcost);

	}

}
