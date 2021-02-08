package com.portifolio.petclinic.repository;

import com.portifolio.petclinic.model.PetPhoto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetPhotoRepository extends JpaRepository<PetPhoto, Long>{
    
}
