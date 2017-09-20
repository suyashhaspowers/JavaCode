import java.util.*;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter a mass in kilograms: ");
		String mass = keyboard.nextLine();
		double intMass = Double.parseDouble(mass);
		double joules = intMass * (30000000*30000000);
		double bulbsHour = (joules*0.00027778);
		System.out.println("The enegy produced in joules is: "+joules);
		System.out.println("The number of 100-watt bulbs that can be powered is: "+bulbsHour);

	}

}
