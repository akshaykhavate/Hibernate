package org.akshay.app.manytomany.dto;

import java.util.Set;

public class Bus {
	private int id;
	private String name;
	private String route;
	private Set<Passenger> passengers;
	public Set<Passenger> getPassengers() {
		return passengers;
	}
	public void setPassengers(Set<Passenger> passengers) {
		this.passengers = passengers;
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
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
}
