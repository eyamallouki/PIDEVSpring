package tn.esprit.pithepowerplayers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.pithepowerplayers.entities.Reservation;
import tn.esprit.pithepowerplayers.entities.StatusReservation;

import java.util.Date;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
    @Query("SELECT r FROM Reservation r WHERE r.date_Reservation BETWEEN :startDate AND :endDate")
    List<Reservation> findReservationsBetweenDates(@Param("startDate") Date startDate, @Param("endDate") Date endDate);

    @Query("SELECT r FROM Reservation r WHERE r.statusReservation = :status")
    List<Reservation> findByStatus(@Param("status") StatusReservation status);

    @Modifying
    @Query("UPDATE Reservation r SET r.amnout = :price WHERE r.id_Reservation = :reservationId")
    void updateReservationAmnout(@Param("reservationId") Integer reservationId, @Param("price") Float price);

    //@Query("SELECT r FROM Reservation r")
    // List<Reservation> findAll();
    List<Reservation> findAll();
}