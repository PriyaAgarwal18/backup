package com.mindtree.hospital.dto;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mindtree.hospital.entity.Doctor;

public class Patientdto {
	private int patientId;
	private String patientName;
	private int patientBillamount;
	@JsonIgnore

	
	 private Doctordto doctordto;
	public Patientdto() {
		
	}
	Patientdto(int patientId, String patientName, int patientBillamount, Doctordto doctordto) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientBillamount = patientBillamount;
		this.doctordto = doctordto;
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
	public Doctordto getDoctordto() {
		return doctordto;
	}
	public void setDoctordto(Doctordto doctordto) {
		this.doctordto = doctordto;
	}
	

}
