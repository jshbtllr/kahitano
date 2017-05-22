package racescheduler;
import racehorse.Horse;
import raceupdate.ServiceClass;
import java.util.ArrayList;

public class RaceMonitor implements Runnable {
	ArrayList <Horse> horseEntries = new ArrayList <Horse>();
	ServiceClass horseTimer = new ServiceClass();

	public RaceMonitor (ArrayList <Horse> input, ServiceClass timer) {
		this.horseEntries = input;
		this.horseTimer = timer;
	}

	public void run() {
			try {
				System.out.println("Test");
				Thread.sleep(5000);
				System.out.println("Wake Test");
				trackTimer.trackTime();
			} catch (InterruptedException ie) {
				//none so far
			}
	}


}