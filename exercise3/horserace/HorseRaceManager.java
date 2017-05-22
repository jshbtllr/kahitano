import java.util.Random;
import racehorse.RaceHorse;
import inputcheck.Utility;

public class HorseRaceManager {
	public static void main(String [] args) {
		
		System.out.print("Enter number of horses: ");
		Integer raceHorses = Integer.parseInt(Utility.input_utility());
		System.out.println("Number of Horses Entered: " + raceHorses);


	}
}
