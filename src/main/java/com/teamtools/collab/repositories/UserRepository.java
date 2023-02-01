package com.teamtools.collab.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teamtools.collab.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	Optional<User> findByUsername(String username);
	
	Boolean existsByUsername(String username);
	
	Boolean existsByEmail(String email);

}
