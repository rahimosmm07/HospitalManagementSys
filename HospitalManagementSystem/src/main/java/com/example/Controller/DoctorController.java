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

import com.example.Entity.Doctor;
import com.example.Service.DoctorService;

@RestController
public class DoctorController {
	@Autowired
	DoctorService doctorService;
	
	@GetMapping (value ="/doctor")
	public List<Doctor>getAllDoctor(){
		return doctorService.getAllDoctor();
		
	}
	@GetMapping(value="/doctor/{name}")
	public List <Doctor>findByName(@PathVariable String name){
		return doctorService.getDoctorByName(name);
		
	}
	@PostMapping (value="/doctor")
	public Doctor addNewDoctor(@RequestBody Doctor doctor) {
		return doctorService.addDoctor(doctor);
		
	}
	@DeleteMapping (value="/doctor/{id}")
	public String deleteDoctor (@PathVariable int id){
		doctorService.deleteDoctor(id);
		return "Doctor is deleted";
		
	}
	@RequestMapping(value="/doctor",produces = "application/json",method= RequestMethod.PUT)
	public Doctor updateService(@RequestBody Doctor doctor) {
		return doctorService.UpdateDoctor(doctor);
	}
			
	
	
	

}
