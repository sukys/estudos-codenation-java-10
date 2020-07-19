package com.challenge.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.entity.User;
import com.challenge.repository.CandidateRepository;
import com.challenge.repository.UserRepository;
import com.challenge.service.interfaces.UserServiceInterface;

@Service
public class UserServiceImpl implements UserServiceInterface {

	UserRepository repository;
	CandidateRepository candidateRepository;

	@Autowired
	public UserServiceImpl(UserRepository repository, CandidateRepository candidateRepository) {
		this.repository = repository;
		this.candidateRepository = candidateRepository;
	}

	@Override
	public List<User> findByAccelerationName(String name) {
		return candidateRepository.findUserByAccelerationName(name);
	}

	@Override
	public List<User> findByCompanyId(Long companyId) {
		return candidateRepository.findUserByCompanyId(companyId);
	}

	@Override
	public User save(User entity) {
		return repository.save(entity);
	}

	@Override
	public Optional<User> findById(Long id) {
		return repository.findById(id);
	}
	
	

}
