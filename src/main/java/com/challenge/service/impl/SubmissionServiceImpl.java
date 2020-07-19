package com.challenge.service.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.entity.Submission;
import com.challenge.repository.SubmissionRepository;
import com.challenge.service.interfaces.SubmissionServiceInterface;

@Service
public class SubmissionServiceImpl implements SubmissionServiceInterface {

	private SubmissionRepository repository;
	
	@Autowired
	public SubmissionServiceImpl(SubmissionRepository repository) {
		this.repository = repository;
	}

	@Override
	public BigDecimal findHigherScoreByChallengeId(Long challengeId) {
		Submission score = repository.findTopByIdChallengeIdOrderByScoreDesc(challengeId);
		return Objects.nonNull(score) ? BigDecimal.valueOf(score.getScore()) : BigDecimal.ZERO;
	}

	@Override
	public List<Submission> findByChallengeIdAndAccelerationId(Long challengeId, Long accelerationId) {
		return repository.findByChallengeIdAndAccelerationId(challengeId, accelerationId);
	}

	@Override
	public Submission save(Submission entity) {
		return repository.save(entity);
	}

	
	

}
