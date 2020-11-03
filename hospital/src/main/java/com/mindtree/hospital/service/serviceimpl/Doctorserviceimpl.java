package com.mindtree.hospital.service.serviceimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.service.spi.ServiceException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.hospital.dto.Doctordto;
import com.mindtree.hospital.entity.Doctor;
import com.mindtree.hospital.entity.Patient;
import com.mindtree.hospital.exception.ErrorConstants;
import com.mindtree.hospital.repository.Doctorrepository;
import com.mindtree.hospital.repository.Patientrepository;
import com.mindtree.hospital.service.Doctorservice;

@Service
public class Doctorserviceimpl implements Doctorservice {
	@Autowired
	private Doctorrepository doctorrepository;
	@Autowired
	private Patientrepository patientrepository;
	ModelMapper modelmapper = new ModelMapper();

// method to add patient and assign to doctor

	@Override
	public List<Doctor> postdoctorservice(String doctorName, String patientName, String doctorSpecialization) {
		List<Doctor> doctors = new ArrayList<Doctor>();
		List<Doctor> doctortwo = new ArrayList<Doctor>();
		List<Patient> patients = new ArrayList<Patient>();
		/*
		 * doctor = doctorrepository.findAll(); int count = 0; int value = 0; for
		 * (Doctor doctors : doctor) { if
		 * (doctors.getDoctorName().equalsIgnoreCase(doctorName) &&
		 * doctors.getDoctorSpecialization().equalsIgnoreCase(doctorSpecialization)) {
		 * List<Patient> patients = new ArrayList<Patient>(); count++; patients =
		 * patientrepository.findAll(); for (Patient patientone : patients) { if
		 * (patientone.getPatientName().equals(patientName)) { Doctor doctorone =
		 * doctorrepository.findById(doctors.getDoctorId()).get();
		 * patientone.setDoctor(doctorone); // patientrepository.save(patient);
		 * doctortwo.add(doctors); value++; } doctorrepository.saveAll(doctortwo); } } }
		 * if (count < 1) { throw new ServiceException(ErrorConstants.NOSUCHDOCTOR); }
		 * if (value < 1) { throw new ServiceException(ErrorConstants.NOSUCHPATIENT); }
		 */
		doctors = doctorrepository.findAll().stream().filter(
				i -> i.getDoctorName().equals(doctorName) && i.getDoctorSpecialization().equals(doctorSpecialization))
				.collect(Collectors.toList());
		// patients = patientrepository.findAll().stream().filter(i->
		// i.getPatientName().equals(patientName)).collect(Collectors.toList());
		/*
		 * for(Doctor doctorone:doctors) { for(Patient patientone:patients) {
		 */
		/*
		 * doctors.forEach(doctorone ->{ patients.forEach(patientone ->{
		 * patientone.setDoctor(doctorone); patientrepository.save(patientone);
		 * doctortwo.add(doctorone); }); });
		 */

		// doctors.forEach(i->i.getPatient().forEach(j->{j.setDoctor(i);patientrepository.save(j);doctortwo.add(i);}));

		doctors.forEach(i -> {
			patientrepository.findAll().stream().filter(l -> l.getPatientName().equals(patientName)).forEach(k -> {
				k.setDoctor(i);
				patientrepository.save(k);
				doctortwo.add(i);
			});
		});

		/*
		 * }
		 * 
		 * }
		 */

		return doctortwo;
	}

	// method to get doctor detail based on their salary

	@Override
	public List<Doctor> getSalarySorted() {
		List<Doctor> doctors = new ArrayList<Doctor>();
		doctors = doctorrepository.findAll();

		for (Doctor doctor : doctors) {
			List<Patient> patient = new ArrayList<Patient>();
			patient = doctor.getPatient();
			int salary = 0;

			// calculate bill and set to particular doctor
			for (Patient patients : patient) {
				salary += patients.getPatientBillamount();
			}
			
			doctor.setDoctorSalary(salary);
			doctorrepository.save(doctor);
		}
		
		
		Collections.sort(doctors, new Sortbysalary());
		return doctors;
	}

	// method to get doctor detail whose patient count >3
	@Override
	public List<Doctor> getpatientcount() {
		List<Doctor> doctors = new ArrayList<Doctor>();
		List<Doctor> doctorlist = new ArrayList<Doctor>();
		doctors = doctorrepository.findAll();
		doctors.forEach(doctor -> {
			List<Patient> patients = new ArrayList<Patient>();
			int count = 0;
			patients = doctor.getPatient();
			for (Patient patient : patients) {
				count++;
			}
			// adding doctor to the list whose patient count>3
			if (count > 3) {
				doctorlist.add(doctor);
			}
		});

		if (doctorlist.isEmpty()) {
			throw new ServiceException(ErrorConstants.NOSUCHDOCTORCOUNT);
		}
		Collections.sort(doctorlist, new Sortbyexperience());
		return doctorlist;
	}

	// method to get all detail
	@Override
	public List<Doctor> getalldetail() {
		List<Doctor> doctors = new ArrayList<Doctor>();
		doctors = doctorrepository.findAll();
		return doctors;
	}

	private Doctordto convertEntityToDto(Doctor doctor) {
		return modelmapper.map(doctor, Doctordto.class);
	}

	private Doctor convertDtoToEntity(Doctordto roomDto) {
		return modelmapper.map(roomDto, Doctor.class);
	}

}

class Sortbysalary implements Comparator<Doctor> {
	public int compare(Doctor a, Doctor b) {
		return a.getDoctorSalary() - b.getDoctorSalary();
	}
}

class Sortbyexperience implements Comparator<Doctor> {

	public int compare(Doctor a, Doctor b) {
		return a.getDoctorYearofexperience() - b.getDoctorYearofexperience();
	}
}
