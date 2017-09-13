package com.detaysoft.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.detaysoft.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long>, JpaSpecificationExecutor{

	Page<Users> findAll(Pageable pageable);
}
