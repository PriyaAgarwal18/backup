package com.mindtree.hospital.service.serviceimpl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.mindtree.hospital.entity.Doctor;
import com.mindtree.hospital.entity.Patient;
import com.mindtree.hospital.repository.Doctorrepository;

@RunWith(MockitoJUnitRunner.class)
@WebMvcTest(Doctorserviceimpl.class)
public class DoctorserviceimplTest {

	@Autowired
	MockMvc mockMvc;

	@InjectMocks
	Doctorserviceimpl doctorservice;

	@Mock
	Doctorrepository doctorrepository;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		mockMvc=MockMvcBuilders.standaloneSetup(doctorservice).build();
	}

	@Test
	public void testGetSalarySorted() {

		List<Patient> patients = new ArrayList<Patient>();
		patients.add(new Patient(1,"patient1",1000,null));
		
		List<Doctor> doctors = new ArrayList<Doctor>();
		doctors.add(new Doctor(1,"doctor1",1,"neorolgy",0,patients));
		
		/*
		 * for (Doctor doctor : doctors) { List<Patient> patient = new
		 * ArrayList<Patient>(); patient = doctor.getPatient(); int salary = 0;
		 * 
		 * for (Patient patie : patient) { salary += patie.getPatientBillamount(); }
		 * 
		 * doctor.setDoctorSalary(salary); doctorrepository.save(doctor); }
		 */
		
		List<Doctor> doctorss = new ArrayList<Doctor>();
		
		doctorss.add(new Doctor(1,"doctor1",1,"neorolgy",1000,patients));
		
		
		when(doctorrepository.findAll()).thenReturn(doctors);
		assertEquals(doctorservice.getSalarySorted().get(0).getDoctorSalary(), 1000);
		

	}

}
