package com.challenge.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.entity.Candidate;
import com.challenge.entity.CandidateId;
import com.challenge.repository.CandidateRepository;
import com.challenge.service.interfaces.CandidateServiceInterface;

@Service
public class CandidateServiceImpl implements CandidateServiceInterface {

	private CandidateRepository repository;
	
	@Autowired
	public CandidateServiceImpl(CandidateRepository repository) {
		this.repository = repository;
	}

	@Override
	public Optional<Candidate> findById(Long userId, Long companyId, Long accelerationId) {
		return repository.findByIdUserIdAndIdAccelerationIdAndIdCompanyId(userId, accelerationId, companyId);
	}

	@Override
	public List<Candidate> findByCompanyId(Long companyId) {
		return repository.findByIdCompanyId(companyId);
	}

	@Override
	public List<Candidate> findByAccelerationId(Long accelerationId) {
		return repository.findByAccelerationId(accelerationId);
	}

	@Override
	public Candidate save(Candidate entity) {
		return repository.save(entity);
	}

	@Override
	public Optional<Candidate> findById(CandidateId id) {
		return repository.findById(id);
	}

	

}
