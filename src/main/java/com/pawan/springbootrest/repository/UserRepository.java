package com.pawan.springbootrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pawan.springbootrest.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
