package com.jsp.PWApp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jsp.PWApp.dao.UserDao;
import com.jsp.PWApp.dto.User;

@Service
public class UserService {

	@Autowired
	UserDao dao;

	public User saveUserService(User user) {
		return dao.saveUser(user);

	}

	public List<User> getAllUserService() {
		return dao.getAllUser();
	}

	public User getUserByIdService(int id) {
		return dao.getUserById(id);
	}

	public User updateUserService(User user) {
		return dao.updateUser(user);
	}

	public User deleteUserService(int id) {
		return dao.deleteUser(id);
	}
}
