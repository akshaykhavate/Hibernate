package org.hib.inhe.pgm.Bean;

public class Bike extends Vehicle{
	private boolean kicker;
	private boolean alloy;
	public boolean isKicker() {
		return kicker;
	}
	public void setKicker(boolean kicker) {
		this.kicker = kicker;
	}
	public boolean isAlloy() {
		return alloy;
	}
	public void setAlloy(boolean alloy) {
		this.alloy = alloy;
	}
}
