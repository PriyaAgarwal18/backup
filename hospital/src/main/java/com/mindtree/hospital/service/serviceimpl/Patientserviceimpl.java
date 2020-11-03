package com.mindtree.hospital.service.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.hospital.entity.Patient;
import com.mindtree.hospital.repository.Patientrepository;
import com.mindtree.hospital.service.Patientservice;

@Service
public class Patientserviceimpl implements Patientservice{
	@Autowired
	private Patientrepository patientrepository;

	@Override
	public List<Patient> getdetail() {
		// TODO Auto-generated method stub
		List<Patient> patients = new ArrayList<Patient>();
		patients = patientrepository.findAll();
		return patients;
	}
	/*
	 * 
	 * 
	 * }
	 */
	

}
