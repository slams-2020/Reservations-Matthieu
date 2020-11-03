package net.reservations.repositories;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import net.reservations.models.User;

@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Integer>{
	public Optional<User> findByidUser(int idUser);
	public Long deleteByidUser(int idUser);
    public Optional<User> findByEmail(String email);
    public Long deleteByEmail(String email);
    public Optional<User> findByPassword(String password);
    public Optional<User> findByName(String firstname);
    public Long deleteByName(String firstname);
    public Optional<User> findByName2(String lastname);
    public Long deleteByName2(String lastname);
}
