package com.detaysoft.todo.controller;
//https://github.com/sdqali/spring-json-filter

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.detaysoft.todo.entity.Pj03;
import com.detaysoft.todo.repository.Pj03Repository;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
//import com.detaysoft.todo.repository.Pj03Repository;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

/**
 * Created by serhatboyraz on 13.09.2017.
 */
@RestController
@RequestMapping("todo")
public class ToDoServiceController {

	@Autowired
	private Pj03Repository repo;
	
//	private Pj03Service pj03Service;
//
//	@Autowired
//	public ToDoServiceController(Pj03Service pj03Service) {
//		this.pj03Service = pj03Service;
//	}

	@GetMapping("getToDo")
	public List<Pj03> getToDo() {
	
		return repo.getPj03();
	}
	@GetMapping("getToDo2")
	public Page<Pj03> getToDo2(Pageable p) {
	
		return repo.findAll(p);
	}


	@GetMapping("getToDoList")
	public MappingJacksonValue  getToDoList(Pageable pageable){
		Page<Pj03> users = repo.findAll(pageable);
//		List<Pj03> users=repo.getPj03();

//	    MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(users);
//	    FilterProvider filters = new SimpleFilterProvider()
//	                .addFilter("myFilter", SimpleBeanPropertyFilter
//	                        .filterOutAllExcept("pj01"));
//	    mappingJacksonValue.setFilters(filters);
//	    return mappingJacksonValue;
		MappingJacksonValue value;

	    value = new MappingJacksonValue(users);
	    String[] prop=new String[1];
	    prop[0]="pj01";
	    FilterProvider filters = ModelJsonFilters.getDefaultFilters().addFilter(ModelJsonFilters.SECTEUR_FILTER, SimpleBeanPropertyFilter.serializeAllExcept(prop)).addFilter(ModelJsonFilters.APPLICATION_FILTER,
	            SimpleBeanPropertyFilter.serializeAllExcept("services"));

	    value.setFilters(filters);
	    return value;
	}
}
