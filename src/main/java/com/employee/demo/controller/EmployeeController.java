package com.employee.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.employee.demo.PageSession;
import com.employee.demo.model.Employee;
import com.employee.demo.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService service;

	
	@RequestMapping("home")
	public String welcome(Model model) {
		
		model.addAttribute("employees", service.getEmployees());
		
		return "home";
	}
	
	@PostMapping("updateHourlyEmployee")
	public String updateHourlyEmployee(
			Integer id,
			Integer workedDays,
			Integer noOfVacationDays,
			String action) {
		
		if(action.equals("updateWorkedDays"))
			service.updateHourlyEmployeeWorkedVacationDays(id, workedDays);
		else
			service.updateHourlyEmployeeWorkedVacationDays(id,noOfVacationDays);

		return "redirect:home";
	}
	
	@PostMapping("updateSalariedEmployee")
	public String updateSalariedEmployee(
			Integer id,
			Integer workedDays,
			Integer noOfVacationDays,
			String action) {
		
		if(action.equals("updateWorkedDays"))
			service.updateSalariedEmployeeVacationDays(id, workedDays);
		else
			service.updateSalariedEmployeeVacationDays(id,noOfVacationDays);

		return "redirect:home";
	}
	
	@PostMapping("updateManagerEmployee")
	public String updateManagersEmployee(
			Integer id,
			Integer workedDays,
			Integer noOfVacationDays,
			String action) {
		
		if(action.equals("updateWorkedDays"))
			service.updateManagersEmployeeVacationDays(id, workedDays);
		else
			service.updateManagersEmployeeVacationDays(id,noOfVacationDays);

		return "redirect:home";
	}
	
}
