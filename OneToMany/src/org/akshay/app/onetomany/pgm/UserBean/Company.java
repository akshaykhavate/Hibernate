package org.akshay.app.onetomany.pgm.UserBean;

import java.util.Set;

public class Company {
	private int id;
	private String name;
	private String loc;
	private Set<Department> departments;

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
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Set<Department> getDepartments() {
		return departments;
	}
	public void setDepartments(Set<Department> departments) {
		this.departments = departments;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", loc=" + loc + ", departments=" + departments + "]";
	}
}
