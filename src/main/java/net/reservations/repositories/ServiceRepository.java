package net.reservations.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.reservations.models.Service;


public interface ServiceRepository extends JpaRepository<Service, Integer>{
	List<Service> findByidService(int idService);
    List<Service> findByName(String name);
}

