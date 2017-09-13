package com.detaysoft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Service;

import com.detaysoft.entity.Users;
import com.detaysoft.repository.UserRepository;
import com.detaysoft.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public Page<Users> findAll(Pageable pageable) {

		return userRepository.findAll(pageable);
	}

}
