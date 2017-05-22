package racehorse;

protected class Horse {
	private String horseName;

	public Horse(String horseName) {
		this.horseName = horseName;
	}

	public void setHorseName(String input) {
		this.horseName = input;
	}

	public String getHorseName() {
		return this.horseName;
	}
}

public class RaceHorse extends Horse {
	private Integer distanceToFinish;
	private String warCry;

	public void setDistance(Integer input) {
		this.distanceToFinish = input;
	}

	public Integer getDistance() {
		return this.distanceToFinish;
	}

	public void setWarCry(String input) {
		this.warCry = input;
	}

	public String getWarCry() {
		return this.warCry;
	}
}