package net.reservations.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import net.reservations.models.Location;
@EnableJpaRepositories

public interface LocationRepository extends JpaRepository<Location, Integer>{
	public Optional<Location> findByidLocation(int idLocation);
	public Long deleteByidLocation(int idLocation);
	public Optional<Location> findBygps(String gps);
	public Long deleteBygps(String gps);
	public Optional<Location> findByAdress1(String adress1);
	public Long deleteByAdress1(String adress1);
	public Optional<Location> findByAdress2(String adress2);
	public Long deleteByAdress2(String adress2);
}