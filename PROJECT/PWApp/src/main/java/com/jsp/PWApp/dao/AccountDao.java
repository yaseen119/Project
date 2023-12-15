package com.jsp.PWApp.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.jsp.PWApp.dto.Account;
import com.jsp.PWApp.repository.AccountRepositary;

@Repository
public class AccountDao {

	@Autowired
	AccountRepositary repositary;

	public Account saveAccount(Account account) {
		return repositary.save(account);
	}

	public List<Account> getAllAccount() {
		return repositary.findAll();
	}

	public Account getAccountById(int id) {
		Optional<Account> optional = repositary.findById(id);
		return optional.get();
	}

	public Account updateAccount(Account account) {
		Optional<Account> optional = repositary.findById(account.getId());
		if (optional.isPresent()) {
			return repositary.save(account);
		}
		return optional.get();
	}

	public Account deleteAccount(int id) {
		Optional<Account> optional = repositary.findById(id);
		if (optional.isPresent()) {
			repositary.delete(optional.get());
		}
		return optional.get();
	}

}
