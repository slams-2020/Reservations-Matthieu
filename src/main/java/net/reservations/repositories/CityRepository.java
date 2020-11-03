package net.reservations.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import net.reservations.models.City;

@EnableJpaRepositories
public interface CityRepository extends JpaRepository<City, Integer>{
	public Optional<City> findByidCity(int idCity);
	public Long deleteByidCity(int idCity);
	public Optional<City> findBycp(int cp);
	public Long deleteBycp(int cp);
	public Optional<City> findByName(String name);
	public Long deleteByName(String name);
}