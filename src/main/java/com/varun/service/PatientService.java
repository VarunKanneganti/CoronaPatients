package com.varun.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varun.Entity.Patient;
import com.varun.repo.PatientRepo;

@Service
public class PatientService {
	
	@Autowired
	PatientRepo repo;
	
	public void addPatient(Patient caseId) {
		repo.save(caseId);
	}
	
	public Iterable<Patient> getAllPatients() {
		return repo.findAll();
	}
	
	public Optional<Patient> getPatientbyId(Integer caseId){
		return repo.findById(caseId);
	}
	
	public void updatePatient(Patient caseId) {
		repo.save(caseId);
	}
	
	public void deleteById(Integer caseId) {
		repo.deleteById(caseId);
	}
	
	public void deleteAll() {
		repo.deleteAll();
	}
}
