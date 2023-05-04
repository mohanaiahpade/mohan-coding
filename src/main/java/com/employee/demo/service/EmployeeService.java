package com.employee.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.demo.model.Employee;
import com.employee.demo.repository.EmployeeRepository;
import com.employee.demo.repository.HourlyEmployeeRepository;
import com.employee.demo.repository.SalariedEmployeeRepository;
import com.employee.demo.repository.ManagersEmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	HourlyEmployeeRepository hrRepo;
	@Autowired
	SalariedEmployeeRepository salRepo;
	@Autowired
	ManagersEmployeeRepository mgrepo;
	@Autowired
	EmployeeRepository repo;

	public List<Employee> getEmployees() {
		List<Employee> employees = repo.findAll();	
		
		return employees;
	}
	
	public void updateHourlyEmployeeWorkedVacationDays(
			Integer id,
			Integer workedDays) {
		Employee employee = hrRepo.findById(id);
		float vacationDays = hrRepo.work(workedDays);
		employee.setNoOfVacationDaysAccumulated(vacationDays);
		repo.save(employee);
	}
	
	public void updateSalariedEmployeeVacationDays(
			Integer id,
			Integer noOfVacationDays) {
		Employee employee = salRepo.findById(id);
		float vacationDays = salRepo.takeVacation(noOfVacationDays);
		employee.setNoOfVacationDaysAccumulated(vacationDays);
		repo.save(employee);
	}
	
	public void updateManagersEmployeeVacationDays(
			Integer id,
			Integer noOfVacationDays) {
		Employee employee = mgrepo.findById(id);
		float vacationDays = mgrepo.takeVacation(noOfVacationDays);
		employee.setNoOfVacationDaysAccumulated(vacationDays);
		repo.save(employee);
	}
	
	
}
