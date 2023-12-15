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

import com.jsp.PWApp.dto.User;
import com.jsp.PWApp.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;

//-->for database testing by postman tool

//	@PostMapping("/users")
//	public User saveUserController(@RequestBody User user) {
//		return service.saveUserService(user);
//	}
//
//	@GetMapping("/users")
//	public List<User> getAllUserController() {
//		return service.getAllUserService();
//	}
//
//	@GetMapping("/users/{id}")
//	public User getUserByIdController(@PathVariable int id) {
//		return service.getUserByIdService(id);
//	}
//
//	@PutMapping("/users")
//	public User updateUserController(@RequestBody User user) {
//		return service.updateUserService(user);
//	}
//
//	@DeleteMapping("/users/{id}")
//	public User deleteUsercontroller(@PathVariable int id) {
//		return service.deleteUserService(id);
//	}

//--------------------------------------------------------------------------------------------------------------------------

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView andView = new ModelAndView("home");
//		andView.addObject("msg", "Hi good to see you");
		return andView;
	}

	@RequestMapping("/aboutUs")
	public ModelAndView about() {
		ModelAndView andView = new ModelAndView("about");
		return andView;
	}

	@RequestMapping("/servicesOffered")
	public ModelAndView services() {
		ModelAndView andView = new ModelAndView("services");
		return andView;
	}

	@RequestMapping("/contactUs")
	public ModelAndView contactUs() {
		ModelAndView andView = new ModelAndView("contactUs");
		return andView;
	}

	@RequestMapping("/registerUser")
	public ModelAndView load() {
		ModelAndView andView = new ModelAndView("register");
		andView.addObject("user1", new User());
		return andView;
	}

	@RequestMapping("/saveUser")
	public ModelAndView save(@ModelAttribute User user) {
		User user2 = service.saveUserService(user);

		if (user2 != null) {
			ModelAndView andView = new ModelAndView("login");
			andView.addObject("user1", new User());
			return andView;
		} else {
			ModelAndView andView = new ModelAndView("/registerUser");
			return andView;
		}
	}

	@RequestMapping("/loginUser")
	public ModelAndView login() {
		ModelAndView andView = new ModelAndView("login");
		andView.addObject("user1", new User());
		return andView;
	}

	@RequestMapping("/loginUser1")
	public ModelAndView login(@ModelAttribute User user) {
		List<User> users = service.getAllUserService();

		for (User user2 : users) {
			if ((user2.getEmail().equals(user.getEmail())) && (user2.getPassword().equals(user.getPassword()))) {
				ModelAndView andView = new ModelAndView("userHome");
				andView.addObject("user1", user2);
				return andView;
			} else {
				ModelAndView andView = new ModelAndView("/loginUser");
				return andView;
			}
		}
		return null;
	}

	@RequestMapping("/settingUser")
	public ModelAndView setting() {
		ModelAndView andView = new ModelAndView("setting");
		return andView;
	}

	@RequestMapping("/home1")
	public ModelAndView homeUser() {
		ModelAndView andView = new ModelAndView("home");
//		andView.addObject("msg", "Hi good to see you");
		return andView;
	}

	@RequestMapping("/displayUsers1")
	public ModelAndView displayUser() {
		ModelAndView andView = new ModelAndView("displayUsers");
		andView.addObject("display", service.getAllUserService());
		return andView;
	}

	@RequestMapping("/editUser1")
	public ModelAndView edit(@RequestParam int id) {
		ModelAndView andView = new ModelAndView("editUser");
		andView.addObject("edit", service.getUserByIdService(id));
		return andView;
	}

	@RequestMapping("/updateUser1")
	public ModelAndView update(@ModelAttribute User user) {
		service.updateUserService(user);

		ModelAndView andView = new ModelAndView("setting");
		return andView;
	}

	@RequestMapping("/deleteUser1")
	public ModelAndView delete(@RequestParam int id) {
		service.deleteUserService(id);

		ModelAndView andView = new ModelAndView("setting");
		return andView;
	}

}
