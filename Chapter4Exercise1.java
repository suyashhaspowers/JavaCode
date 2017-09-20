import java.util.*;

public class Chapter4Exercise1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter a time less than 4.5 seconds:");
		String answer = keyboard.nextLine();
		double intanswer = Double.parseDouble(answer);
		System.out.println("The height of the rocket is: "+ (100-4.9*(intanswer*intanswer))+"m");		 

	}

}
