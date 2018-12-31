package org.voyage.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.voyage.demo.dao.HotelRepository;
import org.voyage.demo.entities.Hotel;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    public List<Hotel> getAll() {

        return hotelRepository.findAll();
    }

    @Override
    public Hotel findById(int id) {
        return hotelRepository.findById(id).get();

    }

    public void add(Hotel hotel) {

        hotelRepository.save(hotel);
    }

    public Optional<Hotel> update(Hotel hotel) {

        return Optional.ofNullable(hotelRepository.saveAndFlush(hotel));
    }

    public void deleteHotel(int id) {
        hotelRepository.deleteById(id);
    }

}
