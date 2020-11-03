package net.reservations.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import net.reservations.models.Type;

@EnableJpaRepositories
public interface TypeRepository extends JpaRepository<Type, Integer>{
	public Optional<Type> findByidType(int idType);
	public Long deleteByidType (int idType);
	public Optional<Type> findByLibelle(String libelle);
	public Long deleteByLibelle (String libelle);
}
