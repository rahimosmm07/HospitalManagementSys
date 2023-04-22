package com.example.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {
	@Id
	int did;
	String name;
	String Department;
	@OneToMany(fetch =FetchType.EAGER,mappedBy ="doctor", cascade=CascadeType.ALL)
	
	List <Patient>patient;
	
}
