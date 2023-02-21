package com.pfa.gestiondeclinique;

import com.pfa.gestiondeclinique.entities.Patients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientsRepository extends JpaRepository<Patients, Long> {
}