package com.pawan.springbootrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pawan.springbootrest.model.User;
// here we don't require @Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
