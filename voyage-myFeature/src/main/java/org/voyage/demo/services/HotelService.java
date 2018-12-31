package org.voyage.demo.services;

import org.springframework.stereotype.Repository;
import org.voyage.demo.entities.Hotel;

@Repository
public interface HotelService {

    public Hotel findById(int id);

}
