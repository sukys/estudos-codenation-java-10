package com.challenge.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.entity.Company;
import com.challenge.repository.CompanyRepository;
import com.challenge.service.interfaces.CompanyServiceInterface;

@Service
public class CompanyServiceImpl implements CompanyServiceInterface {

	CompanyRepository repository;
	
	@Autowired
	public CompanyServiceImpl(CompanyRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Company> findByAccelerationId(Long accelerationId) {
		return repository.findDistinctByCandidatesIdAccelerationId(accelerationId);
	}

	@Override
	public List<Company> findByUserId(Long userId) {
		return repository.findByCandidatesIdUserId(userId);
	}

	@Override
	public Company save(Company entity) {
		return repository.save(entity);
	}

	@Override
	public Optional<Company> findById(Long id) {
		return repository.findById(id);
	}



}
