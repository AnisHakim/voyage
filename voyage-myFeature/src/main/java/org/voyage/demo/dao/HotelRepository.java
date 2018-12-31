package org.voyage.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.voyage.demo.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {

}
