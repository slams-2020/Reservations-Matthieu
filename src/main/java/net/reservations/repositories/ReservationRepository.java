package net.reservations.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import net.reservations.models.Reservation;

@EnableJpaRepositories
public interface ReservationRepository extends JpaRepository<Reservation, Integer>{
	List<Reservation> findByidReservation(int idReservation);
    List<Reservation> findByPrice(int price);
    List<Reservation> findBystartDate(String startDate);
    List<Reservation> findByendDate(String endDate);
}
