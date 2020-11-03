package com.mindtree.hospital.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Doctor implements Serializable{
	@Id
	private int doctorId;
	private String doctorName;
	private int doctorYearofexperience;
	private String doctorSpecialization;
	private int doctorSalary;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "doctor")
	private List<Patient> patient;

	public Doctor() {

	}

	public Doctor(int doctorId, String doctorName, int doctorYearofexperience, String doctorSpecialization,
			int doctorSalary, List<Patient> patient) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorYearofexperience = doctorYearofexperience;
		this.doctorSpecialization = doctorSpecialization;
		this.doctorSalary = doctorSalary;
		this.patient = patient;
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

	public List<Patient> getPatient() {
		return patient;
	}

	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", doctorYearofexperience="
				+ doctorYearofexperience + ", doctorSpecialization=" + doctorSpecialization + ", doctorSalary="
				+ doctorSalary + ", patient=" + patient + "]";
	}

}
