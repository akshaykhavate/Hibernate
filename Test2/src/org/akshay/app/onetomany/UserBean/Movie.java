package org.akshay.app.onetomany.UserBean;

import java.util.Set;

public class Movie {
	private int id;
	private String name;
	private Set<Actors> actors;
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
	public Set<Actors> getActors() {
		return actors;
	}
	public void setActors(Set<Actors> actors) {
		this.actors = actors;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", actors=" + actors + "]";
	}
	
}
