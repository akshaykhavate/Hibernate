package org.hib.inhe.pgm.Bean;

public class Car extends Vehicle {
	private boolean music_system;
	private boolean ac;
	public boolean isMusic_system() {
		return music_system;
	}
	public void setMusic_system(boolean music_system) {
		this.music_system = music_system;
	}
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean ac) {
		this.ac = ac;
	}
	
}
