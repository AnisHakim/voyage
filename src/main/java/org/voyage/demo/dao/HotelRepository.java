package org.voyage.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.voyage.demo.entities.Hotel;



public interface HotelRepository extends JpaRepository<Hotel,Integer> {
	Optional<Hotel> findById(Long id);
}
