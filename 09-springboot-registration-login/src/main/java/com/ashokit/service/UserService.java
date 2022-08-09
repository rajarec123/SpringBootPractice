package com.ashokit.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.ashokit.model.User;
import com.ashokit.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto);
}
