package racehorse; 
import raceupdate.ServiceClass;

public class Horse {
	private String horseName;
	private Integer raceDistance = 0;
	private Integer distanceCovered = 0;
	private Integer gateDistance = 0;
	private Boolean inGate = false;
	private Boolean isFinished = false;

	public Horse (String horseName, Integer raceDistance) {
		this.horseName = horseName;
		this.raceDistance = raceDistance;
	}
	public Integer getGateDistance() {
		return this.gateDistance;
	}
	
	public void setGateDistance(Integer input) {
		gateDistance += input;
	}
	
	public Integer getRaceDistance() {
		return this.raceDistance;
	}
	
	public void setRaceDistance(Integer input) {
		this.raceDistance = input;
	}
	
	public String getHorseName() {
		return this.horseName;
	}
	
	public void setHorseName(String input) {
		this.horseName = input;
	}
	
	public void setDistanceCovered(Integer input) {
		this.distanceCovered += input;
	}
	
	public Integer getDistcanceCovered() {
		return this.distanceCovered;
	}

	public Boolean getInGate () {
		return this.inGate;
	}

	public void setInGate(Boolean input) {
		this.inGate = input;
	}

	public Boolean getIsFinished() {
		return this.isFinished;
	}

	public void setIsFinished(Boolean input) {
		this.isFinished = input;
	}
}
