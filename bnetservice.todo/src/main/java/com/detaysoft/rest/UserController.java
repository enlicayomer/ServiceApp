package com.detaysoft.rest;

import java.util.List;

import org.hibernate.engine.jdbc.connections.internal.UserSuppliedConnectionProviderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.detaysoft.entity.Users;
import com.detaysoft.repository.UserRepository;
import com.detaysoft.service.UserService;
import com.detaysoft.spec.UserSpecification;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	UserRepository userRep;

	@GetMapping
	public Page<Users> getUserList(@RequestParam("page") int page,
								  @RequestParam("size") int size){
		return userService.findAll(new PageRequest(page, size));
	}
	
	
	@GetMapping("deneme")
	public Page<Users> getUserList()
	{
		return userRep.findAll(UserSpecification.getPersonUser(3L),new PageRequest(0, 5));
	}


	@GetMapping("save")
	public void saveUser() {
		Users user = new Users();
		user.setName("asdf");
		user.setSurname("enlicay");
		userRep.save(user);
	}

}
