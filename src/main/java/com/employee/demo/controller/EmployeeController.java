package com.employee.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

import com.employee.demo.model.Employee;
import com.employee.demo.repository.HourlyEmployeeRepository;
import com.employee.demo.repository.ManagerRepository;
import com.employee.demo.repository.SalariedEmployeeRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {
    private List<Employee> employees;

    @RequestMapping("home")
    public String welcome(Model model) {
        employees = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            employees.add(new HourlyEmployeeRepository());
            employees.add(new SalariedEmployeeRepository());
            employees.add(new ManagerRepository());
        }
        
        model.addAttribute("employees", employees);
        return "home";
    }

    @PostMapping("updateEmployee")
    public String updateEmployee(int workedDays, double vacationDays, int employeeIndex,
    		String action ) {
        Employee employee = employees.get(employeeIndex);
        if(action.equals("updateWorkedDays")) {
        	employee.work(workedDays);
        } else {
        	employee.takeVacation(vacationDays);
        }
        
        
        return "redirect:home";
    }
}