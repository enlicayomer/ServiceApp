package com.detaysoft.todo.service;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.detaysoft.todo.entity.Pj03;


public interface Pj03Service {

	List<Pj03> findAll(Pageable pageable);
}
