package org.voyage.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.voyage.demo.entities.ReservationHotel;

public interface ReservationHotelRepository extends JpaRepository<ReservationHotel,Integer> {
}
