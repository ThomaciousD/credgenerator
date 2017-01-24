package com.tda.password;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PasswordController {

	@Resource(name="passwordGenerator")
	private PasswordGenerator passwordGenerator; 
	
	@RequestMapping("/password")
	public Password generatePassword(@RequestParam(value = "l", defaultValue = "0") int length) {
		return new Password(passwordGenerator.generatePassword(length));
	}
}