package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Entity.Patient;

@Service

public interface PatientService {
	public Patient addPatient(Patient patient);
	public List<Patient>getAllPatient();
	public void deletePatient(int id);
	public Patient UpdatePatient(Patient patient);
    public List<Patient>getPatientByName(String name);
    //public List<Patient>findPatientById(int id);
	

}
