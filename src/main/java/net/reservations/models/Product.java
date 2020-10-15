package net.reservations.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idProduct;
	private String type;
	private String title;
	private String description;
	private int price;
	
	@ManyToOne
	private Location location;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Photo photo;
	
	@ManyToMany
    @JoinTable(name = "caracteristicProduct")
    private List<Caracteristic> caracteristics;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="product")
    private List<Photo> photos;
	
	
	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Product [type=" + type + ", title=" + title + ", description=" + description + ", price=" + price + "]";
	}
	
}
