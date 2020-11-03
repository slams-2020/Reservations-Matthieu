package net.reservations.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import net.reservations.models.Type;

@EnableJpaRepositories
public interface TypeRepository extends JpaRepository<Type, Integer>{
	List<Type> findByidType(int idType);
    List<Type> findByLibelle(String libelle);
}
