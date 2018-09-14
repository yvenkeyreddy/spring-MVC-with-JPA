package com.ge.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ge.entity.Employee;
import com.ge.service.EmployeeService;

@Controller
@RequestMapping(path = "/new")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(method = RequestMethod.GET)
	public String displayForm(Model model) {
		model.addAttribute("employee", new Employee());
		return "RegistrationForm";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String processForm(@Valid Employee employee, BindingResult result) throws Exception {
		if (result.hasErrors()) {
			return "RegistrationForm";
		} else {
			employeeService.saveData(employee);
		}
		return "SuccessForm";
	}
}
