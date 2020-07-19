package com.challenge.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.challenge.entity.Candidate;
import com.challenge.entity.CandidateId;
import com.challenge.entity.User;


@Repository
public interface CandidateRepository extends BaseRepository<Candidate, CandidateId>{
	
	/**
	 * Busca os candidatos vinculadas a uma aceleração
	 * @param compannyId
	 * @return
	 */
	@Query(value = "SELECT c FROM Candidate c WHERE c.id.acceleration.id = ?1")
	List<Candidate> findByAccelerationId(Long accelerationId); 
	
	/**
	 * Busca os candidatos vinculadas a uma empresa
	 * @param compannyId
	 * @return
	 */
	@Query(value = "SELECT c FROM Candidate c WHERE c.id.company.id = ?1")
	List<Candidate> findByIdCompanyId(Long companyId); 

	/**
	 * Recupera um candidato pelos ids das entidades que compoe seu Id.
	 * @param userId
	 * @param accelerationId
	 * @param companyId
	 * @return
	 */
	Optional<Candidate> findByIdUserIdAndIdAccelerationIdAndIdCompanyId(Long userId, Long accelerationId, Long companyId);
	
	
	@Query(value = "SELECT c.id.user FROM Candidate c WHERE c.id.company.id = ?1")
	List<User> findUserByCompanyId(Long companyId); 


	@Query(value = "SELECT c.id.user FROM Candidate c WHERE c.id.acceleration.name = ?1")
	List<User> findUserByAccelerationName(String name); 
	
}
