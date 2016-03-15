package se.kth.iv1201.spring.web.controllers;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import se.kth.iv1201.spring.web.dao.Person;
import se.kth.iv1201.spring.web.dao.Role;
import se.kth.iv1201.spring.web.editors.RoleEditor;
import se.kth.iv1201.spring.web.service.PersonService;
import se.kth.iv1201.spring.web.service.RoleService;

@Controller
public class RegisterController {

	private PersonService personService;
	private RoleService roleService;
	private RoleEditor roleEditor;
	public Logger logger = Logger.getLogger(RegisterController.class);

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Role.class, this.roleEditor);
	}

	@Inject
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

	@Inject
	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}
	
	@Inject
	public void setRoleEditor(RoleEditor roleEditor) {
		this.roleEditor = roleEditor;
	}

	@RequestMapping("/register")
	public String showRegister(Model model) {

		model.addAttribute("person", new Person());

		List<Role> roles = roleService.getPublicRoles();
		model.addAttribute("roles", roles);

		return "register";
	}

	@RequestMapping(value = "/docreate", method = RequestMethod.POST)
	public String doCreate(Model model,@Valid Person person, BindingResult result) {
		System.out.println(person.getRole());

		if (result.hasErrors()) {
			List<Role> roles = roleService.getPublicRoles();
			model.addAttribute("roles", roles);
			logger.info("A user failed to register");
			return "register";
		}

		System.out.println(model.toString());
		personService.create(person);

		logger.info("A new user is register with the name: " + person.getName() + " surname: " +  person.getSurname() + " username: " + person.getUsername() + " email: " + person.getEmail() + " role: " + person.getRole().getName() + " SSN: " + person.getSsn());

		return "registered";

	}

}
