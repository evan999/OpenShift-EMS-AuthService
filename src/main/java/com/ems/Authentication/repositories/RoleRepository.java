package com.ems.Authentication.repositories;

import com.ems.Authentication.models.ERole;
import com.ems.Authentication.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
