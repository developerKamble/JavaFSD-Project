package com.project.Authentication.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.Authentication.entities.User;
import com.project.Authentication.exceptions.USerNotFoundException;
import com.project.Authentication.repositories.AuthenticationRepository;
@Service
public class AuthenticationService {
	@Autowired
	AuthenticationRepository authRepo;
	public User GetUserByName(String name) {
		Optional<User> found = authRepo.findUserByName(name);
		if(found.isPresent()) return found.get();
		else throw new USerNotFoundException();
	}
public Boolean isValidPassword(String cmp, String actual) {
return ((cmp.equals(actual)) ?  true :  false);	
}
}
