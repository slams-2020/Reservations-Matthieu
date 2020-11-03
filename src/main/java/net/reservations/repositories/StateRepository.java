package net.reservations.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import net.reservations.models.State;

@EnableJpaRepositories
public interface StateRepository extends JpaRepository<State, Integer>{
	public Optional<State> findByidState(int idState);
	public Long deleteByidState(int idState);
	public Optional<State> findByName(String name);
	public Long deleteByName(String name);
}