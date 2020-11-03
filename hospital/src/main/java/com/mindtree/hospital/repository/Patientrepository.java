package com.mindtree.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.hospital.entity.Patient;

@Repository
public interface Patientrepository extends JpaRepository<Patient,Integer>{
	
}
