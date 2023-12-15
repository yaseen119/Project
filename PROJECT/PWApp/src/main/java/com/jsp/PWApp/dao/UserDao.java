package com.jsp.PWApp.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.jsp.PWApp.dto.User;
import com.jsp.PWApp.repository.UserRepositary;

@Repository
public class UserDao {

	@Autowired
	UserRepositary repositary;

	public User saveUser(User user) {
		return repositary.save(user);
	}

	public List<User> getAllUser() {
		return repositary.findAll();
	}

	public User getUserById(int id) {
		Optional<User> optional = repositary.findById(id);
		return optional.get();
	}

	public User updateUser(User user) {
		Optional<User> optional = repositary.findById(user.getId());
		if (optional.isPresent()) {
			return repositary.save(user);
		}
		return optional.get();
	}

	public User deleteUser(int id) {
		Optional<User> optional = repositary.findById(id);
		if (optional.isPresent()) {
			repositary.delete(optional.get());
		}
		return optional.get();
	}
}
