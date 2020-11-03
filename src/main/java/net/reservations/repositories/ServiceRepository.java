package net.reservations.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import net.reservations.models.Service;

@EnableJpaRepositories
public interface ServiceRepository extends JpaRepository<Service, Integer>{
	public Optional<Service> findByidService(int idService);
	public Long deleteByidService(int idService);
	public Optional<Service> findByName(String name);
	public Long deleteByName(String name);
}

