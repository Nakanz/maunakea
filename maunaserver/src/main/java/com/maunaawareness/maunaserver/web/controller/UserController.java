package com.maunaawareness.maunaserver.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.maunaawareness.maunaserver.manager.UserManager;
import com.maunaawareness.maunaserver.web.vo.LoginCredentials;
import com.maunaawareness.maunaserver.web.vo.SignUpCredentials;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserManager userManager;
	
	@RequestMapping(method = RequestMethod.POST, value = "/sign-up", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean signUp(@RequestBody SignUpCredentials credentials) {
		return userManager.createUser(credentials);
	}
	
	@RequestMapping(value = "/sign-in", produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean signIn(@RequestParam(value="username") String username, @RequestParam(value = "password") String password) {
		return userManager.loginUser(new LoginCredentials(username, password));
	}
	
	
}
