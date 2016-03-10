package se.kth.iv1201.spring.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicantController {
	
	@RequestMapping("/applicant")
	public String showHome(Model model) {

		model.addAttribute("name", "Henke");

		return "applicant";
	}
	
}
