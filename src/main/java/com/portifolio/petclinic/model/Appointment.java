package com.portifolio.petclinic.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.portifolio.petclinic.model.enums.AppointmentStatus;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "start_schedule_date")
    private LocalDateTime startScheduleDate;

    @Column(name = "end_schedule_date")
    private LocalDateTime endScheduleDate;

    @Enumerated(EnumType.STRING)
    private AppointmentStatus status;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;
    
    @ManyToOne
    @JoinColumn(name = "vet_id")
    private Vet vet;
}
