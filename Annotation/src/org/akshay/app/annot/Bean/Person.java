package org.akshay.app.annot.Bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="person_anno")
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	@OneToOne(cascade=CascadeType.ALL,mappedBy="person")
	private BirthCetificate bc;
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
	public BirthCetificate getBc() {
		return bc;
	}
	public void setBc(BirthCetificate bc) {
		this.bc = bc;
	}
	
}
