package com.example.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.models.Role;

@Repository("roleRepository")
public interface RoleDao extends JpaRepository<Role, Integer>{

    Role findByRole(String role);

}