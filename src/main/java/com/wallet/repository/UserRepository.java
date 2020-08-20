package com.wallet.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wallet.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	Optional<User> findByEmailEquals(String email);

}
