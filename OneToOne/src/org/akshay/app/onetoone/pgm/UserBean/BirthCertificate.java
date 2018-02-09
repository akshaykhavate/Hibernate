package org.akshay.app.onetoone.pgm.UserBean;

public class BirthCertificate {
	private int id;
	private String place;
	private String dob;
	private Person person;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "BirthCertificate [id=" + id + ", place=" + place + ", dob=" + dob + ", person=" + person + "]";
	}
}
