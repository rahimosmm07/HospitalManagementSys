package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Patient;
import com.example.Service.PatientService;

@RestController
public class PatientController {
	@Autowired
	
	PatientService patientService;
	
	@GetMapping(value ="/patient")
	public List<Patient> getAllPatient(){
		return patientService.getAllPatient();
		
	}
	@GetMapping(value ="/patient/{name}")
	public List<Patient> findByName(@PathVariable String name){
		return patientService.getPatientByName(name);
		
	}
	//@GetMapping(value ="/patient/{id}")
	//public List<Patient> findById(@PathVariable int id){
		//return patientService.findPatientById(id);
		
	//}
	@PostMapping(value ="/patient")
	public Patient addNewPatient(@RequestBody Patient patient) {
		return patientService.addPatient(patient);
		
	}
	@DeleteMapping(value ="/patient/{id}")
	public String deletePatient(@PathVariable int id){
		patientService.deletePatient(id);
		return "Patient is deleted";
			
	}
	@RequestMapping(value ="/patient",produces = "application/json",method =RequestMethod.PUT)
	public Patient updatePatient(@RequestBody Patient patient) {
		return patientService.UpdatePatient(patient);
		
		
	}
	

}
