package org.akshay.app.onetomany.pgm.UserBean;

public class Department {
	private int id;
	private String name;
	private int num;
	private Company company;
	
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company com) {
		this.company = com;
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
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", num=" + num + "]";
	}

}
