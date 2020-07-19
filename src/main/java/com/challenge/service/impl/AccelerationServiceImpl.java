package com.challenge.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.entity.Acceleration;
import com.challenge.repository.AccelerationRepository;
import com.challenge.service.interfaces.AccelerationServiceInterface;

@Service
public class AccelerationServiceImpl implements AccelerationServiceInterface {

	AccelerationRepository repository;
	
	@Autowired
	public AccelerationServiceImpl(AccelerationRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Acceleration> findByCompanyId(Long companyId) {
		return repository.findByCandidatesIdCompanyId(companyId);
	}

	@Override
	public Optional<Acceleration> findByName(String name) {
		return repository.findByName(name);
	}

	@Override
	public Acceleration save(Acceleration entity) {
		return repository.save(entity);
	}

	@Override
	public Optional<Acceleration> findById(Long id) {
		return repository.findById(id);
	}

}
