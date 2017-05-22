import inputhandler.InputUtility;
import racehorse.Horse;
import raceupdate.ServiceClass;
import java.util.ArrayList;
import tracker.RaceAnnouncer;

public class RaceSetup implements Runnable {

	Horse jockeyHorse;
	
	public RaceSetup(Horse input) {
		this.jockeyHorse = input;
	}
	
	public void run() {
		//try {
			ServiceClass.toGate(jockeyHorse);
			//ServiceClass.toFinish(jockeyHorse);
			//none so far
	//	} catch (InterruptedException ie) {
			//
	//	}
	}
	
	public static void main(String [] args) {
		ArrayList <Horse> allHorses = new ArrayList <Horse>();

		System.out.print("Input number of horses to enter the race: ");
		final Integer horseNumber = InputUtility.integerCheck(2);

		System.out.print("Input distance of the race: ");
		final Integer raceDistance = InputUtility.integerCheck(101);

		System.out.println("Race Details:");
		System.out.println("There are " + horseNumber + " horses included in this race");
		System.out.println("The race is " + raceDistance + " gallops long");
		
		for (int i = 1; i <= horseNumber.intValue(); i++) {
			Horse participant = new Horse("Horse--" + i, raceDistance);
			RaceSetup enterRace = new RaceSetup(participant);
			Thread startRace = new Thread(enterRace);
			allHorses.add(participant);
			startRace.start();
		}

		RaceAnnouncer announcer = new RaceAnnouncer(allHorses);
		Thread announceRace = new Thread(announcer);
		announceRace.start();
		//System.out.println("Race Announcer is present");
	}
}
