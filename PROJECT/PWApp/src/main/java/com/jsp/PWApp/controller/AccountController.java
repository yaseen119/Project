package com.jsp.PWApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.PWApp.dto.Account;
import com.jsp.PWApp.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	AccountService service;

//-->for database testing by postman tool

//	@PostMapping("/accounts")
//	public Account saveAccountController(@RequestBody Account account) {
//		return service.saveAccountService(account);
//	}
//
//	@GetMapping("/accounts")
//	public List<Account> getAllAccountController() {
//		return service.getAllAccountService();
//	}
//
//	@GetMapping("/accounts/{id}")
//	public Account getAccountByIdController(@PathVariable int id) {
//		return service.getAccountByIdService(id);
//	}
//
//	@PutMapping("/accounts")
//	public Account updateAccountController(@RequestBody Account account) {
//		return service.updateAccountService(account);
//	}
//
//	@DeleteMapping("/accounts/{id}")
//	public Account deleteAccountcontroller(@PathVariable int id) {
//		return service.deleteAccountService(id);
//	}

// --------------------------------------------------------------------------------------------------------------------------

	@RequestMapping("/userHome1")
	public ModelAndView userHome() {
		ModelAndView andView = new ModelAndView("userHome");
//		andView.addObject("msg", "Hi good to see you");
		return andView;
	}

	@RequestMapping("/registerAccount1")
	public ModelAndView load() {
		ModelAndView andView = new ModelAndView("registerAccount");
		andView.addObject("account1", new Account());
		return andView;
	}

	@RequestMapping("/saveAccount1")
	public ModelAndView save(@ModelAttribute Account account) {
		Account account2 = service.saveAccountService(account);

		if (account2 != null) {
			ModelAndView andView = new ModelAndView("userHome");
			return andView;
		} else {
			ModelAndView andView = new ModelAndView("/registerAccount1");
			return andView;
		}
	}

	@RequestMapping("/settingAccount1")
	public ModelAndView home() {
		ModelAndView andView = new ModelAndView("settingAccounts");
		return andView;
	}

	@RequestMapping("/displayAccounts1")
	public ModelAndView getAccounts() {
		ModelAndView andView = new ModelAndView("displayAccounts");
		andView.addObject("accounts", service.getAllAccountService());
		return andView;
	}

	@RequestMapping("/editAccount1")
	public ModelAndView edit(@RequestParam int id) {
		ModelAndView andView = new ModelAndView("editAccount");
		andView.addObject("edit", service.getAccountByIdService(id));
		return andView;
	}

	@RequestMapping("/updateAccount1")
	public ModelAndView update(@ModelAttribute Account account) {
		service.updateAccountService(account);

		ModelAndView andView = new ModelAndView("settingAccounts");
		return andView;
	}

	@RequestMapping("deleteAccount1")
	public ModelAndView delete(@RequestParam int id) {
		service.deleteAccountService(id);

		ModelAndView andView = new ModelAndView("settingAccounts");
		return andView;
	}

	@RequestMapping("/paymentAccount1")
	public ModelAndView payment() {
		ModelAndView andView = new ModelAndView("paymentAccounts");
		return andView;
	}

	@RequestMapping("/checkBalance1")
	public ModelAndView checkBal() {
		ModelAndView andView = new ModelAndView("checkBalance");
		andView.addObject("accounts", service.getAllAccountService());
		return andView;
	}

	@RequestMapping("/sendFrom1")
	public ModelAndView sendFrom1() {
		ModelAndView andView = new ModelAndView("sendFrom");
		andView.addObject("account1", new Account());
		return andView;
	}

	@RequestMapping("/sendFrom2")
	public ModelAndView sendFrom2(@ModelAttribute Account account) {
		service.sendFrom2Service(account);

		ModelAndView andView = new ModelAndView("sendTo");
		andView.addObject("account1", new Account());
		return andView;
	}

	@RequestMapping("/sendTo1")
	public ModelAndView sendAmt(@ModelAttribute Account account) {
		service.sendAmtService(account);

		ModelAndView andView = new ModelAndView("paymentAccounts");
		return andView;
	}

	@RequestMapping("/receiveTo1")
	public ModelAndView receiveFrom1() {
		ModelAndView andView = new ModelAndView("receiveTo");
		andView.addObject("account1", new Account());
		return andView;
	}

	@RequestMapping("/receiveTo2")
	public ModelAndView receiveFrom2(@ModelAttribute Account account) {
		service.receiveFrom2Service(account);

		ModelAndView andView = new ModelAndView("receiveFrom");
		andView.addObject("account1", new Account());
		return andView;
	}

	@RequestMapping("/receiveFrom1")
	public ModelAndView receiveAmt(@ModelAttribute Account account) {
		service.receiveAmtService(account);

		ModelAndView andView = new ModelAndView("paymentAccounts");
		return andView;
	}
}
