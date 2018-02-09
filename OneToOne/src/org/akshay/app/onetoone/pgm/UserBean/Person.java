package org.akshay.app.onetoone.pgm.UserBean;

public class Person {
	private int id;
	private String name;
	private BirthCertificate bc;

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
	public BirthCertificate getBc() {
		return bc;
	}
	public void setBc(BirthCertificate bc) {
		this.bc = bc;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", bc=" + bc + "]";
	}
}
