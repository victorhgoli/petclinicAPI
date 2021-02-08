package com.portifolio.petclinic.controller;

import java.util.List;

import com.portifolio.petclinic.model.Pet;
import com.portifolio.petclinic.repository.PetRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "pet")
public class PetController {

    @Autowired
    PetRepository petRepository;

    @GetMapping
    public List<Pet> getPets() {
        return petRepository.findAll();
    }

    
    @PostMapping
    public Pet addPet(@RequestBody Pet p) {
        return petRepository.save(p);
    }

    @PutMapping
    public Pet updatePet(@RequestBody Pet p){
        return petRepository.save(p);
    }

    @DeleteMapping
    public void deletePet(Long id){
        petRepository.deleteById(id);
    }

    @GetMapping(value = "/findByStatus")
    public List<Pet> getPetsByStatus(String status) {
        return petRepository.findByStatus(status);
    }


    @PostMapping(value = "/uploadPhoto")
    public void upLoadPhoto(Long petId, String photo){

    }

}
