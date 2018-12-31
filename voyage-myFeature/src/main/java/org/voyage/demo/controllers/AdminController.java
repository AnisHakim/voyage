package org.voyage.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.voyage.demo.entities.Vol;
import org.voyage.demo.services.VolService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private VolService volService;

    @GetMapping({ "vol/getAll" })
    public List<Vol> gelAllVol() {
        return volService.getAll();
    }

    @GetMapping({ "vol/findById/{id}" })
    public Vol getVol(@PathVariable final int id) {
        return volService.findById(id);
    }

    @PostMapping({ "vol/add" })
    public void addVol(@RequestBody Vol vol) {
        volService.add(vol);
    }

    @PutMapping({ "/vol/update" })
    public Optional<Vol> updateVol(@RequestBody Vol vol) {
        return volService.update(vol);
    }

    @DeleteMapping({ "vol/delete/{id}" })
    public void deleteVol(@PathVariable final int id) {
        volService.delete(id);
    }
}
