package com.teamtools.collab.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teamtools.collab.models.ERole;
import com.teamtools.collab.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Optional<Role> findByName(ERole name);
	
	
}
