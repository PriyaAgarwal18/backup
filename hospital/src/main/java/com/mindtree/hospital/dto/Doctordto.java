package com.mindtree.hospital.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import com.mindtree.hospital.entity.Patient;

public class Doctordto {
	private int doctorId;
	private String doctorName;
	private int doctorYearofexperience;
	private String doctorSpecialization;
	private int doctorSalary;
	
	
	private List<Patientdto> patientdto;
	public Doctordto() {
		
	}

	public Doctordto(int doctorId, String doctorName, int doctorYearofexperience, String doctorSpecialization,
			int doctorSalary, List<Patientdto> patientdto) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorYearofexperience = doctorYearofexperience;
		this.doctorSpecialization = doctorSpecialization;
		this.doctorSalary = doctorSalary;
		this.patientdto = patientdto;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public int getDoctorYearofexperience() {
		return doctorYearofexperience;
	}

	public void setDoctorYearofexperience(int doctorYearofexperience) {
		this.doctorYearofexperience = doctorYearofexperience;
	}

	public String getDoctorSpecialization() {
		return doctorSpecialization;
	}

	public void setDoctorSpecialization(String doctorSpecialization) {
		this.doctorSpecialization = doctorSpecialization;
	}

	public int getDoctorSalary() {
		return doctorSalary;
	}

	public void setDoctorSalary(int doctorSalary) {
		this.doctorSalary = doctorSalary;
	}

	public List<Patientdto> getPatientdto() {
		return patientdto;
	}

	public void setPatientdto(List<Patientdto> patientdto) {
		this.patientdto = patientdto;
	}
	

}
