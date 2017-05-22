package inputcheck;
import java.util.Scanner;

public class Utility {

	public static String input_utility() {
		Scanner userInput = new Scanner(System.in);
		String input = null;
		Integer horseNumber = null;
		
		while (true) {
			try {
				input = userInput.nextLine();
				horseNumber = Integer.parseInt(input);
				if (horseNumber.intValue() < 2) {
					System.out.print("Number of horses should be greater than 2. Pick another number: ");
				} else {
					break;
				}

			} catch (NumberFormatException ne) {
				System.out.print("Input not a number. Pick the number of horses: ");
			}
		}
		return input;
	}
}