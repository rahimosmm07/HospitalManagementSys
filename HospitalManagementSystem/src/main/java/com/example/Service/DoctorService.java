package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Entity.Doctor;

@Service
public interface DoctorService {
	public Doctor addDoctor(Doctor doctor);
	public List<Doctor>getAllDoctor();
	public void deleteDoctor (int id);
	public Doctor UpdateDoctor(Doctor doctor);
	List <Doctor> getDoctorByName(String name);
	
	

}
