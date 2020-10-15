package net.reservations.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class State {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idState;
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="state")
    private List<City> citys;
	
	public int getIdState() {
		return idState;
	}
	public void setIdState(int idState) {
		this.idState = idState;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
