package se.kth.iv1201.spring.web.controllers;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import se.kth.iv1201.spring.web.dao.Person;
import se.kth.iv1201.spring.web.service.PersonService;


@Controller
public class BasicController {
	
	
	private PersonService personService;

	@Inject
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

	@RequestMapping("/")
	public String showHome(Model model) {

		model.addAttribute("name", "Henke");

		return "welcome";
	}

	@RequestMapping("/admin")
	public String showAdmin(Model model) {

		List<Person> persons = personService.getPersons();

		model.addAttribute("person", persons);

		return "admin";
	}

}
