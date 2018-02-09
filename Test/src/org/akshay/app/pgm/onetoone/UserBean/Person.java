package org.akshay.app.pgm.onetoone.UserBean;

public class Person {
	private int id;
	private String name;
	private PAN pan;
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
	public PAN getPan() {
		return pan;
	}
	public void setPan(PAN pan) {
		this.pan = pan;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", pan=" + pan + "]";
	}
}
