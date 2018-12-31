package org.voyage.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.voyage.demo.entities.User;


public interface UserRepository extends JpaRepository<User,Integer>{

}
