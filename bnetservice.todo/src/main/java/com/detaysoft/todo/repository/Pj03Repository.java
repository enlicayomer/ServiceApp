package com.detaysoft.todo.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.detaysoft.todo.entity.Pj03;

public interface Pj03Repository extends JpaRepository<Pj03, String> {

	@RestResource(path = "pj01", rel = "pj01")
	Page<Pj03> findAll(Pageable pageable);
}
