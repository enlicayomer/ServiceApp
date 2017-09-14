package com.detaysoft.todo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.detaysoft.todo.entity.Pj03;
import com.detaysoft.todo.repository.Pj03Repository;
import com.detaysoft.todo.service.Pj03Service;

@Service
public class Pj03ServiceImpl implements Pj03Service {

	private Pj03Repository pj03Repository;
	
	@Autowired
	public Pj03ServiceImpl(Pj03Repository pj03Repository) {
		this.pj03Repository=pj03Repository;
	}
	
	@Override
	public Page<Pj03> findAll(Pageable pageable) {
		return pj03Repository.findAll(pageable);
	}

}
