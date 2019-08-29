package com.maunaawareness.maunaserver.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maunaawareness.maunaserver.entity.PasswordEnt;
import com.maunaawareness.maunaserver.entity.UserEnt;
import com.maunaawareness.maunaserver.repository.PasswordRepository;
import com.maunaawareness.maunaserver.repository.UserRepository;
import com.maunaawareness.maunaserver.web.vo.SignUpCredentials;

@Service
public class UserManager {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordRepository passwordRepository;
	
	public boolean createUser(SignUpCredentials credentials) {
		if (credentials != null) {
			UserEnt user = userRepository.save(new UserEnt(credentials.getLastname(), credentials.getFirstname(), credentials.getUsername(), credentials.getEmail()));
			if (credentials.getPassword().contentEquals(credentials.getConfirmPassword())) {
				passwordRepository.save(new PasswordEnt(user.getUserId(), credentials.getPassword()));
				return true;
			}
		}
		return false;
	}
}
