package org.akshay.app.manytomany.dto;

import java.util.Set;

public class Passenger {
	private int id;
	private String name;
	private String dob;
	private Set<Bus> buses;
	public Set<Bus> getBuses() {
		return buses;
	}
	public void setBuses(Set<Bus> buses) {
		this.buses = buses;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
}
