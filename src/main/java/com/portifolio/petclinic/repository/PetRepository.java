package com.portifolio.petclinic.repository;

import java.util.List;
import com.portifolio.petclinic.model.Pet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet,Long>{
    
    List<Pet> findByStatus(String status);

}
