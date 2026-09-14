package com.aws.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
	
	@Autowired
	UsersRepo u;
	
	
	@GetMapping("/users/{id}")
	public Users get(@PathVariable("id") Integer id) {
		return u.findById(id).orElse(null);
	}
	

}
