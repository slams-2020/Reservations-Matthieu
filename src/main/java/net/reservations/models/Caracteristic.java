package net.reservations.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Caracteristic {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idCaracteristic;
	private String label;
	
	@ManyToMany(mappedBy="caracteristics")
    private List<Product> products;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="caracteristic")
    private List<Type> type;
	
	public int getIdCaracteristic() {
		return idCaracteristic;
	}
	public void setIdCaracteristic(int idCaracteristic) {
		this.idCaracteristic = idCaracteristic;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
}
