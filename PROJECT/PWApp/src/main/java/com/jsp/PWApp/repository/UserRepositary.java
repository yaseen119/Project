package com.jsp.PWApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jsp.PWApp.dto.User;

public interface UserRepositary extends JpaRepository<User, Integer> {

}
