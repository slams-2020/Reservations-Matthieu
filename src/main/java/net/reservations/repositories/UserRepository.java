package net.reservations.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.reservations.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	List<User> findByidUser(int idUser);
    List<User> findByEmail(String email);
    List<User> findByPassword(String password);
    List<User> findByFirstname(String firstname);
    List<User> findByLastname(String lastname);
}
