package net.reservations.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import net.reservations.models.City;

@EnableJpaRepositories
public interface CityRepository extends JpaRepository<City, Integer>{
	List<City> findByidCity(int idCity);
	List<City> findBycp(int cp);
	List<City> findByName(String name);
}