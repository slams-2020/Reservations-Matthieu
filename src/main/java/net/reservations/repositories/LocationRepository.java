package net.reservations.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.reservations.models.Location;

public interface LocationRepository extends JpaRepository<Location, Integer>{
	List<Location> findByidLocation(int idLocation);
    List<Location> findBygps(String gps);
    List<Location> findByAdress1(String adress1);
    List<Location> findByAdress2(String adress2);
}
