package com.detaysoft.todo.controller;
//https://github.com/sdqali/spring-json-filter
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.detaysoft.todo.config.JsonFilter;
import com.detaysoft.todo.entity.Pj03;
//import com.detaysoft.todo.repository.Pj03Repository;
import com.detaysoft.todo.service.Pj03Service;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by serhatboyraz on 13.09.2017.
 */
@RestController
@RequestMapping("todo")
public class ToDoServiceController {

	private Pj03Service pj03Service;

	@Autowired
	public ToDoServiceController(Pj03Service pj03Service) {
		this.pj03Service = pj03Service;
	}

	@GetMapping("getToDo")
	public ResponseEntity getToDo(@RequestParam("tkid") String tkid) {
		return new ResponseEntity(tkid, HttpStatus.OK);
	}

	@GetMapping("getToDoList")
	public ResponseEntity<List<Pj03>> getToDoList(Pageable pageable){
	
		return new ResponseEntity<List<Pj03>>(pj03Service.findAll(pageable), HttpStatus.OK);
	}
}
