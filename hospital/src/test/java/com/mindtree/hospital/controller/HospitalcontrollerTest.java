package com.mindtree.hospital.controller;

import static org.junit.Assert.*;
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
import com.mindtree.hospital.service.Doctorservice;


@RunWith(MockitoJUnitRunner.class)
@WebMvcTest(Hospitalcontroller.class)
public class HospitalcontrollerTest {

	@Autowired
	MockMvc mockMvc;
	
	@InjectMocks
	Hospitalcontroller hospitalcontroller;
	
	@Mock
	Doctorservice doctorservice;
	
	@Before
	public void setUp() throws Exception {
		
		MockitoAnnotations.initMocks(this);
		mockMvc=MockMvcBuilders.standaloneSetup(hospitalcontroller).build();
	}

	@Test
	public void testpostpatientgetdoctorcount() {
		
		List<Doctor> doctors = new ArrayList<Doctor>();
		
		doctors.add(new Doctor());
		
		when(doctorservice.getpatientcount()).thenReturn(doctors);
		
		assertEquals(hospitalcontroller.postpatientgetdoctorcount().getBody().size(), 4);
		
	}

}
