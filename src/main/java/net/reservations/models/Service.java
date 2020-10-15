package net.reservations.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Service {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idService;
	private String name;
	
	@ManyToMany(mappedBy="services")
	private List<Reservation> reservations;
	
	public int getIdService() {
		return idService;
	}
	public void setIdService(int idService) {
		this.idService = idService;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
