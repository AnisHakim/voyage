package org.voyage.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.voyage.demo.entities.Vol;


public interface VolRepository extends JpaRepository<Vol,Integer>{

}
