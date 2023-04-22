package com.example.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Entity.Doctor;
import com.example.Repository.DoctorRepository;
import com.example.Service.DoctorService;
@Repository

public class DoctorServiceImpl implements DoctorService {
	@Autowired
	DoctorRepository doctorRepository;

	@Override
	public Doctor addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorRepository.save(doctor);
	}

	@Override
	public List<Doctor> getAllDoctor() {
		// TODO Auto-generated method stub
		return doctorRepository.findAll();
	}

	@Override
	public void deleteDoctor(int id) {
		// TODO Auto-generated method stub
		doctorRepository.deleteById(id);
		
	}

	@Override
	public Doctor UpdateDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		Doctor _doctor=doctorRepository.findById(doctor.getDid()).get();
		_doctor.setName(doctor.getName());
		_doctor.setDepartment(doctor.getDepartment());
		doctorRepository.save(_doctor);
		return _doctor;
	}

	@Override
	public List<Doctor> getDoctorByName(String name) {
		// TODO Auto-generated method stub
		return doctorRepository.findDoctorByName(name);
	}
	

}
