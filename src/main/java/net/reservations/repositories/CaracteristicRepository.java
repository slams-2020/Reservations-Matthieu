package net.reservations.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import net.reservations.models.Caracteristic;

@EnableJpaRepositories
public interface CaracteristicRepository extends JpaRepository<Caracteristic, Integer>{
	List<Caracteristic> findByidCaracteristic(int idCaracteristic);
    List<Caracteristic> findByLibelle(String libelle);
}
