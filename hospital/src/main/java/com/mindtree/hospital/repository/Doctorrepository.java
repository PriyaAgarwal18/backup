package com.mindtree.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.hospital.entity.Doctor;

@Repository
public interface Doctorrepository extends JpaRepository<Doctor,Integer> {

}
