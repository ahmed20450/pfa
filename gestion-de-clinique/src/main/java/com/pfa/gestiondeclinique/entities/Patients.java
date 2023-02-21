package com.pfa.gestiondeclinique.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Patients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String medication;
    private double bloodtension;
    private double heartbeats;
    private double weight;
    private double duration;
    private int age;

    public Patients() {
        super();
    }

    public Patients(Long id,String firstname,String lastname,String medication,double bloodtension,double heartbeats,double weight,double duration,int age) {
        super();
        this.firstname=firstname;
        this.lastname = lastname;
        this.medication = medication;
        this.bloodtension = bloodtension;
        this.heartbeats = heartbeats;
        this.weight = weight;
        this.duration = duration;
        this.age = age;
    }

    public Long id() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String firstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String lastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String medication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public double bloodtension() {
        return bloodtension;
    }

    public void setBloodtension(double bloodtension) {
        this.bloodtension = bloodtension;
    }

    public double heartbeats() {
        return heartbeats;
    }

    public void setHeartbeats(double heartbeats) {
        this.heartbeats = heartbeats;
    }

    public double weight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double duration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int age() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Patients{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", medication='" + medication + '\'' +
                ", bloodtension=" + bloodtension +
                ", heartbeats=" + heartbeats +
                ", weight=" + weight +
                ", duration=" + duration +
                ", age=" + age +
                '}';
    }
}