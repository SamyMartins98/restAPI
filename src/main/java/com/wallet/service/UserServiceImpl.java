package com.wallet.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wallet.model.User;
import com.wallet.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserServiceImpl implements UserService{

	private final UserRepository repository;

	@Override
	public User save(User u) {
		return repository.save(u);
	}

	@Override
	public Optional<User> findByEmail(String email) {
		return repository.findByEmailEquals(email);
	}
	
	
	
}
