package net.reservations.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.reservations.models.City;

public interface CityRepository extends JpaRepository<City, Integer>{
	List<City> findByidCity(int idCity);
	List<City> findBycp(int cp);
	List<City> findByName(String name);
}