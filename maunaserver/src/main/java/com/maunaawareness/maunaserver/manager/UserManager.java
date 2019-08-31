package com.maunaawareness.maunaserver.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maunaawareness.maunaserver.entity.PasswordEnt;
import com.maunaawareness.maunaserver.entity.UserEnt;
import com.maunaawareness.maunaserver.repository.PasswordRepository;
import com.maunaawareness.maunaserver.repository.UserRepository;
import com.maunaawareness.maunaserver.web.vo.LoginCredentials;
import com.maunaawareness.maunaserver.web.vo.SignUpCredentials;
import com.maunaawareness.maunaserver.web.vo.User;

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
	// should return boolean or a User object?
	public User loginUser(LoginCredentials credentials) {
		if (credentials != null) {
			UserEnt user = userRepository.getUserEntByUsername(credentials.getUsername());
			if (user != null) {
				PasswordEnt passwordEnt = passwordRepository.getPasswordEntByPasswordUserId(user.getUserId());
				if (passwordEnt.getPassword().contentEquals(credentials.getPassword())) {
					User userData = new User(user.getLastname(), user.getFirstname(), user.getDateJoined(), user.getUsername(), user.getEmail());
					return userData;
				}
			}
		}
		return null;
	}
	
	public User getUser() {
		return new User();
	}
}
