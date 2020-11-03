package net.reservations.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import net.reservations.models.Caracteristic;

@EnableJpaRepositories
public interface CaracteristicRepository extends JpaRepository<Caracteristic, Integer>{
	public Optional<Caracteristic> findByidCaracteristic(int idCaracteristic);
	public Long deleteByCaracteristic(int idCaracteristic);
	public Optional<Caracteristic> findByLibelle(String libelle);
	public Long deleteByLibelle(String libelle);
}
