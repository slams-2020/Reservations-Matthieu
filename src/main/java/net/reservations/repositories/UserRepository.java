package net.reservations.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import net.reservations.models.Product;
import net.reservations.models.User;

@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Integer>{
	List<User> findByidUser(int idUser);
    List<User> findByEmail(String email);
    List<User> findByPassword(String password);
    List<User> findByName(String firstname);
    List<User> findByName2(String lastname);
}
