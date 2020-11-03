package com.mindtree.hospital.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.hospital.entity.Patient;

@Service
public interface Patientservice {

	List<Patient> getdetail();

}
