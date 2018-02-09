package org.akshay.app.onetomany.UserBean;

public class Actors {
	private int id;
	private String name;
	private int num;
	private Movie movie;
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
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	@Override
	public String toString() {
		return "Actors [id=" + id + ", name=" + name + ", num=" + num + ", movie=" + movie + "]";
	}
}
