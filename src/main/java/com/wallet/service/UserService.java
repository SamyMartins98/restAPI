package com.wallet.service;

import java.util.Optional;

import com.wallet.model.User;

public interface UserService {
	
	User save(User u);
	Optional<User> findByEmail(String email);

}
