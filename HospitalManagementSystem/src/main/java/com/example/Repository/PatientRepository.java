package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Patient;

public interface PatientRepository extends JpaRepository<Patient,Integer> {
	public List<Patient>getPatientByName(String Name);
	//public List<Patient>findpatientById(int Id);

}
