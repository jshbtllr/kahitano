package runrace;
import racehorse.Horse;
import raceupdate.ServiceClass;


public class RaceClass implements Runnable {
	Horse jockeyHorse;
	
	public RaceClass(Horse input) {
		this.jockeyHorse = input;
	}
	
	public void run() {
		ServiceClass startRace = new ServiceClass();
		startRace.toGate(jockeyHorse);
		startRace.toFinish(jockeyHorse);
	}
	
}
