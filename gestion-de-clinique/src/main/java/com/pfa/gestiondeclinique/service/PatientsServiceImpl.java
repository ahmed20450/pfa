package com.pfa.gestiondeclinique.service;

import com.pfa.gestiondeclinique.PatientsRepository;
import com.pfa.gestiondeclinique.entities.Patients;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PatientsServiceImpl implements PatientsService{
    private final PatientsRepository patientsRepository;
    @Override
    @Autowired
    public List<Patients> getPatients() {
        return patientsRepository.findAll();
    }
}
