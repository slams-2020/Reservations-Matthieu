package net.reservations.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.reservations.models.State;

public interface StateRepository extends JpaRepository<State, Integer>{
	List<State> findByidState(int idState);
    List<State> findByName(String name);
}