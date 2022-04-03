package com.project.SpringSecurity.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.project.SpringSecurity.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

	public Optional<User>findUserByName(String name); 
}
