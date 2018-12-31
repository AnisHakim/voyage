package org.voyage.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.voyage.demo.entities.Vol;


public interface ReservationVolRepository  extends JpaRepository<Vol,Integer>{

}
