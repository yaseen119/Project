package com.jsp.PWApp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jsp.PWApp.dao.AccountDao;
import com.jsp.PWApp.dto.Account;

@Service
public class AccountService {

	int fromId;

	@Autowired
	AccountDao dao;

	public Account saveAccountService(Account account) {
		return dao.saveAccount(account);
	}

	public List<Account> getAllAccountService() {
		return dao.getAllAccount();
	}

	public Account getAccountByIdService(int id) {
		return dao.getAccountById(id);
	}

	public Account updateAccountService(Account account) {
		return dao.updateAccount(account);
	}

	public Account deleteAccountService(int id) {
		return dao.deleteAccount(id);
	}

	public void sendFrom2Service(Account account) {
		fromId = account.getId();
		System.out.println(fromId);
	}

	public void sendAmtService(Account account) {
		boolean b = false;
		List<Account> accounts = dao.getAllAccount();
		for (Account account2 : accounts) {
			if (fromId == account2.getId()) {
				double amount = account2.getAmount() - account.getAmount();
				if (amount >= 500) {
					account2.setAmount(amount);
					dao.updateAccount(account2);
					b = true;
				}
			}
		}
		for (Account account2 : accounts) {
			if (account.getId() == account2.getId() && b) {
				double amount = account2.getAmount() + account.getAmount();
				account2.setAmount(amount);
				dao.updateAccount(account2);
			}
		}
	}

	public void receiveFrom2Service(Account account) {
		fromId = account.getId();
		System.out.println(fromId);
	}

	public void receiveAmtService(Account account) {
		boolean b = false;
		List<Account> accounts = dao.getAllAccount();

		for (Account account2 : accounts) {
			if (account.getId() == account2.getId()) {
				double amount = account2.getAmount() - account.getAmount();
				if (amount >= 500) {
					account2.setAmount(amount);
					dao.updateAccount(account2);
					b = true;
				}
			}
		}
		for (Account account2 : accounts) {
			if (fromId == account2.getId() && b) {
				double amount = account2.getAmount() + account.getAmount();
				account2.setAmount(amount);
				dao.updateAccount(account2);
			}
		}
	}

}
