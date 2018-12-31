package org.voyage.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.voyage.demo.dao.VolRepository;
import org.voyage.demo.entities.Vol;

@Service
public class VolServiceImpl implements VolService {
    @Autowired
    private VolRepository volRepository;

    @Override
    public List<Vol> getAll() {

        return volRepository.findAll();
    }

    @Override
    public Vol findById(int id) {
        return volRepository.findById(id).get();

    }

    @Override
    public void add(Vol vol) {

        volRepository.save(vol);
    }

    @Override
    public Optional<Vol> update(Vol vol) {

        return Optional.ofNullable(volRepository.saveAndFlush(vol));
    }

    @Override
    public void delete(int id) {
        volRepository.deleteById(id);
    }

}
