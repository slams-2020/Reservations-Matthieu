package net.reservations.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import net.reservations.models.Reservation;

@EnableJpaRepositories
public interface ReservationRepository extends JpaRepository<Reservation, Integer>{
	
	public Optional<Reservation> findByidReservation(int idReservation);
	public Long deleteByidReservation(int idReservation);
	public Optional<Reservation> findByPrice(String price);
	public Long deleteByPrice(String price);
	public Optional<Reservation> findBystartDate(String startDate);
	public Long deleteBystartDate(String startDate);
	public Optional<Reservation> findByendDate(String endDate);
	public Long deleteByendDate(String endDate);
}
