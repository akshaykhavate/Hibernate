package org.hib.app.pgm.one2many.Bean;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="KeyBoard_annot")
public class KeyBoard {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String brand;
	private int noofkeys;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="KeyBoard")
	//private Key key;
	public synchronized int getId() {
		return id;
	}
	public synchronized void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getNoofkeys() {
		return noofkeys;
	}
	public void setNoofkeys(int noofkeys) {
		this.noofkeys = noofkeys;
	}
	/*public Key getKey() {
		return key;
	}
	public void setKey(Key key) {
		this.key = key;
	}*/
	private Set<Key> keys;
	public Set<Key> getKeys() {
		return keys;
	}
	public void setKeys(Set<Key> keys) {
		this.keys = keys;
	}
}
