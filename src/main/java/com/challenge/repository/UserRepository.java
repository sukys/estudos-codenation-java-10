package com.challenge.repository;

import org.springframework.stereotype.Repository;

import com.challenge.entity.User;

@Repository
public interface UserRepository extends BaseRepository<User, Long>{

}
