package com.challenge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.challenge.entity.Submission;
import com.challenge.entity.SubmissionId;

@Repository
public interface SubmissionRepository extends BaseRepository<Submission, SubmissionId> {

	/**
	 * Return higher score by challenge
	 * 
	 * @param challengeId
	 * @return
	 */
	Submission findTopByIdChallengeIdOrderByScoreDesc(Long challengeId);

	/**
	 * Recupera as Submissions pelo challengeId e accelerationId.
	 * 
	 * @param challengeId
	 * @param accelerationId
	 * @return
	 */
	@Query("SELECT sub FROM Submission sub JOIN Acceleration acc " 
			+ "ON acc.challenge.id = sub.id.challenge.id "
			+ "WHERE sub.id.challenge.id = ?1 AND acc.id = ?2")
	List<Submission> findByChallengeIdAndAccelerationId(Long challengeId, Long accelerationId);

}
