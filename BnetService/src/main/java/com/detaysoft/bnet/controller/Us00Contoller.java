package com.detaysoft.bnet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.detaysoft.bnet.entity.Us00;
import com.detaysoft.bnet.repository.Us00Repository;

@RestController
@RequestMapping("user")
public class Us00Contoller {

	@Autowired
	Us00Repository repository;
	
	@GetMapping("")
	public ResponseEntity<List<Us00>> getUserList()
	{
		return new ResponseEntity<List<Us00>>(repository.findAll(),HttpStatus.OK);
	}
}
