package org.voyage.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.voyage.demo.entities.Vol;

@Repository
public interface VolService {

    public List<Vol> getAll();

    public Vol findById(int id);

    public void add(Vol vol);

    public Optional<Vol> update(Vol vol);

    public void delete(int id);

}
