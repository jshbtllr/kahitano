package tracker;
import racehorse.Horse;
import java.util.ArrayList;
import raceupdate.ServiceClass;

public class RaceAnnouncer implements Runnable {

	ArrayList <Horse> allHorses = new ArrayList <Horse>();
	public boolean allGate;
	public boolean allMoved;

	public RaceAnnouncer(ArrayList <Horse> input) {
		this.allHorses = input;
	}

	public void run() {
		
//		synchronized (this) {
			while (true) {
				for (Horse list : allHorses) {
					allGate = true;
					System.out.println(list.getHorseName() + " is currently " + list.getGateDistance() + " steps");
					if (list.getGateDistance() < 10) {				//checks if all horses are already in the gate
						allGate = false;							//marks false if a horse is not in the gate
					}
				}

				if (allGate == true) {							//if horses are in the gate break the loop
					System.out.println("Bye!");
					ServiceClass.test();
					break;
					
				}

				for(Horse list: allHorses) {						//checks if all the horses have moved
					allMoved = true;
					if (list.getInGate().equals(false)) {				//if one horse has not moved mark as false
						allMoved = false;
					}
				}

				if (allMoved == true) {					//if all horses moved
					for (Horse innerList: allHorses) {			//mark all horses who's not at the gate to move	
						if(innerList.getGateDistance() < 10) {
							innerList.setInGate(false);
						}
					}
					
					ServiceClass.test();							//notify all
				}
			}
		//}
	}
}