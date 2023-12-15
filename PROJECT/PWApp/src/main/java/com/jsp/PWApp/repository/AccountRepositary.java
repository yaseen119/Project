package com.jsp.PWApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jsp.PWApp.dto.Account;

public interface AccountRepositary extends JpaRepository<Account, Integer> {

}
