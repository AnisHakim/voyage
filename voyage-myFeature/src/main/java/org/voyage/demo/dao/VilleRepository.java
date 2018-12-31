package org.voyage.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.voyage.demo.entities.Ville;


public interface VilleRepository extends JpaRepository<Ville,Integer>{

}
