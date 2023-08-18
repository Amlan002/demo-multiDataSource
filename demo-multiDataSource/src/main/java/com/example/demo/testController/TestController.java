package com.example.demo.testController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.accountDb.entity.repository.AccountRepository;
import com.example.demo.userdb.entity.repository.UserRepository;

@RestController
public class TestController {

	@Autowired
	UserRepository userRepository;
	@Autowired
	AccountRepository accountRepository;

	@GetMapping("api/getObject/{type}")
	public ResponseEntity<Object> getUserList(@PathVariable String type) {
		Object object = new Object();
		if (type.equalsIgnoreCase("u")) {
			object = userRepository.findAll();
		} else if (type.equalsIgnoreCase("a")) {
			object = accountRepository.findAll();
		} else {
			object = "plz enter correct type";
		}
		return ResponseEntity.ok(object);

	}

}
