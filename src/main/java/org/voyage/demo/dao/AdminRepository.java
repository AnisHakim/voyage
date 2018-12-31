package org.voyage.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.voyage.demo.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin,Integer> {
}
