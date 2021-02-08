package com.portifolio.petclinic.repository;

import com.portifolio.petclinic.model.Vet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VetRepository extends JpaRepository<Vet, Long>{
    
}
