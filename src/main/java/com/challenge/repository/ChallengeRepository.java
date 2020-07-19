package com.challenge.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.challenge.entity.Challenge;

@Repository
public interface ChallengeRepository extends BaseRepository<Challenge, Long>{
	
	/**
	 * Busca um Desafio pelo id da aceleração e id do usuario.
	 * @param name
	 * @return
	 */
	List<Challenge> findByAccelerationsIdAndSubmissionsIdUserId(Long accelerationId, Long userId); 
	
	
	
}
