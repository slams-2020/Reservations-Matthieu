package net.reservations.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.reservations.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	List<Product> findByidProduct(int idProduct);
    List<Product> findByType(String type);
    List<Product> findByTitle(String title);
    List<Product> findByDescription(String description);
    List<Product> findByPrice(int price);
}
