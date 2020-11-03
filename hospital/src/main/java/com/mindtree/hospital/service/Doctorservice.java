package com.mindtree.hospital.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.hospital.entity.Doctor;

@Service
public interface Doctorservice {

	/**
	 * @param doctorName
	 * @param patientName
	 * @param doctorSpecialization
	 * @return inserted doctor
	 */
	List<Doctor> postdoctorservice(String doctorName, String patientName, String doctorSpecialization);

	/**
	 * @return doctor list salary sorted
	 */
	List<Doctor> getSalarySorted();

	/**
	 * @return doctor whose patient count>3
	 */
	List<Doctor> getpatientcount();

	/**
	 * @return all detail
	 */
	List<Doctor> getalldetail();

}
