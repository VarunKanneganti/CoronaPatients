package com.varun.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.varun.Entity.Patient;

@Repository
public interface PatientRepo extends CrudRepository<Patient, Integer> 
{

}