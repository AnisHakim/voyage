package org.voyage.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.voyage.demo.entities.Client;

public interface ClientRepository extends JpaRepository<Client,Integer> {
}
