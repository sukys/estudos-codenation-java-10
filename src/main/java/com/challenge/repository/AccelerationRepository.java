package com.challenge.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.challenge.entity.Acceleration;

@Repository
public interface AccelerationRepository extends BaseRepository<Acceleration, Long>{
	
	/**
	 * Busca uma aceleração pelo nome
	 * @param name
	 * @return
	 */
	Optional<Acceleration> findByName(String name); 
	
	/**
	 * Busca as acelerações vinculadas a uma empresa
	 * @param compannyId
	 * @return
	 */
	List<Acceleration> findByCandidatesIdCompanyId(Long companyId); 

}
