package com.portifolio.petclinic.controller;

import com.portifolio.petclinic.model.Vet;
import com.portifolio.petclinic.repository.VetRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/vet")
public class VetController {

    @Autowired
    private VetRepository vetRepository;

    @GetMapping
    public List<Vet> getAllVets() {
        return vetRepository.findAll();
    }

    @PostMapping
    public Vet addVet(@RequestBody Vet vet){
        return vetRepository.save(vet);
    }

}
