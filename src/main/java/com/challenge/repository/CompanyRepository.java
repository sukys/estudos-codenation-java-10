package com.challenge.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.challenge.entity.Company;

@Repository
public interface CompanyRepository extends BaseRepository<Company, Long>{
	
	/**
	 * Busca uma empresa pelo nome
	 * @param name
	 * @return
	 */
	Optional<Company> findByName(String name); 

	/**
	 * Retorna as empresas vinculadas a uma aceleração.
	 * @param accelerationId
	 * @return
	 */
	List<Company> findDistinctByCandidatesIdAccelerationId(Long accelerationId);
	
	
	/**
	 * Retorna as empresas vinculadas a um usuario.
	 * @param userId
	 * @return
	 */
	List<Company> findByCandidatesIdUserId(Long userId); 
	
}
