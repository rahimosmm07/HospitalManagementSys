package com.example.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Entity.Patient;
import com.example.Repository.PatientRepository;
import com.example.Service.PatientService;
@Repository
public class PatientServiceImpl implements PatientService{
	@Autowired
	PatientRepository patientRepository;

	@Override
	public Patient addPatient(Patient patient) {
		// TODO Auto-generated method stub
		return patientRepository.save(patient);
	}

	@Override
	public List<Patient> getAllPatient() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}

	@Override
	public void deletePatient(int id) {
		// TODO Auto-generated method stub
		patientRepository.deleteById(id);
		
		
	}

	@Override
	public Patient UpdatePatient(Patient patient) {
		// TODO Auto-generated method stub
		Patient _patient=patientRepository.findById(patient.getId()).get();
		_patient.setName(patient.getName());
		_patient.setTreatment(patient.getTreatment());
		patientRepository.save(_patient);
		return null;
	}


	//@Override
	//public List<Patient> findPatientById(int id) {
		// TODO Auto-generated method stub
		//return patientRepository.findpatientById(id);
	//}

	

	@Override
	public List<Patient> getPatientByName(String name) {
		// TODO Auto-generated method stub
		return patientRepository.getPatientByName(name);
	}

}
