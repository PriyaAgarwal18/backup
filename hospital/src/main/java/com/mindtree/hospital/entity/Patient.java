package com.mindtree.hospital.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Patient {
	@Id
	private int patientId;
	private String patientName;
	private int patientBillamount;
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	private Doctor doctor;

	public Patient() {

	}

	public Patient(int patientId, String patientName, int patientBillamount, Doctor doctor) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientBillamount = patientBillamount;
		this.doctor = doctor;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientBillamount() {
		return patientBillamount;
	}

	public void setPatientBillamount(int patientBillamount) {
		this.patientBillamount = patientBillamount;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

}
