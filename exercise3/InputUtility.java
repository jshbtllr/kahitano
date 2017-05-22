package inputhandler;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class InputUtility {
	public static Integer integerCheck(int lowerLimit) {
		Scanner userInput = new Scanner(System.in);
		Integer output;
		String input;
		
		while(true) {
			input = userInput.nextLine();
			try {
				output = Integer.parseInt(input);
				if (output.intValue() >= lowerLimit) {
					break;
				} else {
					System.out.print("Number provided invalid. Input should be greater than " + (lowerLimit-1) + ": ");
				}
			} catch (NumberFormatException nfe) {
				System.out.print("Input not a number. Provide a new number: ");
			}
		}
		
		return output;
	}
	
	public static Integer moveHorse(Integer input) {
		Random number = new Random();
		Integer limit = 0;
		if (input.intValue() < 10) {
			limit = input.intValue();
		}
		
		Integer generated = number.nextInt(10 - limit) + 1;
		return generated;
	}
}
