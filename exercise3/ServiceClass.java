package raceupdate;
import racehorse.Horse;
import inputhandler.InputUtility;
import java.util.ArrayList;

public class ServiceClass {
	private static final Object lock = new Object();
	public static void toGate(Horse input) {
		synchronized(lock) {
			try {
			//	while(true) {
					while (input.getGateDistance().intValue() < 10) {
						Integer horseStep = InputUtility.moveHorse(input.getGateDistance());
						System.out.println(input.getHorseName() + " moved " + horseStep + " towards the Barn Gate");
						input.setGateDistance(horseStep);
						System.out.println(input.getHorseName() + " Distanceeee: " + input.getGateDistance());
						input.setInGate(true);
						System.out.println("Lock!");
						lock.wait();;
					}
					//System.out.println("Unlock All End");
					//lock.notifyAll();

			//		break;
			//	}
			} catch (InterruptedException ie) {
				//none
			}
		}
	}

	public static void test() {
		synchronized (lock) {
//			try {
				System.out.println("Unlock!");
				lock.notifyAll();
//			} catch (InterruptedException ie) {
//				//none
//			}
		}
	}
	
	public static void toFinish(Horse input) {
		synchronized(lock){
//			try {
				System.out.println(input.getHorseName() + " Race Distance: " + input.getRaceDistance());
				while (input.getRaceDistance().intValue() > input.getDistcanceCovered()) {
					Integer horseStep = InputUtility.moveHorse(input.getRaceDistance());
					System.out.println(input.getHorseName() + " moved " + horseStep + " steps towards the Finish Line");
					input.setDistanceCovered(horseStep);
					//wait();
				}			
//			} catch (InterruptedException ie) {
				//none
//			}
		}
	}


}