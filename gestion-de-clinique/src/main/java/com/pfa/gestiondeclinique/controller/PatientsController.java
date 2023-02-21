package com.pfa.gestiondeclinique.controller;

import com.pfa.gestiondeclinique.entities.Patients;
import com.pfa.gestiondeclinique.service.PatientsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/infirmier")
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class PatientsController {
    private final PatientsService patientsService;

    @GetMapping("/patients")
    public List<Patients> getData(){
       return patientsService.getPatients();
    }
}
