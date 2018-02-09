package org.hib.app.pgm.one2many.Bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Key_annot")
public class Key {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String keyType;
	private String visibility;
	@OneToMany(cascade=CascadeType.ALL)
	private KeyBoard keyboard;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKeyType() {
		return keyType;
	}
	public void setKeyType(String keyType) {
		this.keyType = keyType;
	}
	public KeyBoard getKeyboard() {
		return keyboard;
	}
	public void setKeyboard(KeyBoard keyboard) {
		this.keyboard = keyboard;
	}
	public String getVisibility() {
		return visibility;
	}
	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}
}
