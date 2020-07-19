package com.challenge.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.entity.Challenge;
import com.challenge.repository.ChallengeRepository;
import com.challenge.service.interfaces.ChallengeServiceInterface;


@Service
public class ChallengeServiceImpl implements ChallengeServiceInterface {

	ChallengeRepository repository;

	@Autowired
	public ChallengeServiceImpl(ChallengeRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<Challenge> findByAccelerationIdAndUserId(Long accelerationId, Long userId) {
		return repository.findByAccelerationsIdAndSubmissionsIdUserId(accelerationId, userId);
	}

	@Override
	public Challenge save(Challenge entity) {
		return repository.save(entity);
	}

}
