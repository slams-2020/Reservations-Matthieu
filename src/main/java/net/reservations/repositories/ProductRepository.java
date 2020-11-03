package net.reservations.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import net.reservations.models.Product;
@EnableJpaRepositories

public interface ProductRepository extends JpaRepository<Product, Integer>{
	public Optional<Product> findByidProduct(int idProduct);
	public Long deleteByidProduct(int idProduct);
	public Optional<Product> findByType(String type);
	public Long deleteByType(String type);
	public Optional<Product> findByTitle(String title);
	public Long deleteByTitle(String title);
	public Optional<Product> findByDescription(String description);
	public Long deleteByDescription(String description);
	public Optional<Product> findByPrice(String price);
	public Long deleteByPrice(String price);
}
