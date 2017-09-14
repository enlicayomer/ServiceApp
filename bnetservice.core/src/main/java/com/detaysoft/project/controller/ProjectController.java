//package com.detaysoft.project.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.detaysoft.core.entity.Views;
//import com.detaysoft.core.repository.Bp00Repository;
//import com.detaysoft.core.repository.Us00Repository;
//import com.fasterxml.jackson.annotation.JsonView;
//
///**
// * Created by serhatboyraz on 13.09.2017.
// */
//@RestController
//@RequestMapping("project")
//public class ProjectController {
//	
//	
//	@Autowired
//	private Bp00Repository bp00Repository; 
//
//	@Autowired
//	private Us00Repository us00Repository;
//    @JsonView(Views.BusinessPersonList.class)
//    @GetMapping("getBusinessPerson")
//    public ResponseEntity getBusinessPerson(@RequestParam("bpid") String bpid) {
//        return new ResponseEntity(bp00Repository.findByBpid(bpid), HttpStatus.OK);
//    }
//
//    @JsonView(Views.UserList.class)
//    @GetMapping("getUser")
//    public ResponseEntity getBusinessPersonList(@RequestParam("usid") String usid) {
//		 return new ResponseEntity(us00Repository.findByUsid(usid), HttpStatus.OK);
//    }
//}
