package com.detaysoft.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Service;

import com.detaysoft.entity.Users;

public interface UserService {

	Page<Users> findAll(Pageable pageable);
}
