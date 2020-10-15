package net.reservations.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.reservations.models.Type;

public interface TypeRepository extends JpaRepository<Type, Integer>{
	List<Type> findByidType(int idType);
    List<Type> findByLibelle(String libelle);
}
