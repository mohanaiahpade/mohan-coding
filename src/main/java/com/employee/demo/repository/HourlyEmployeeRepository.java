package com.employee.demo.repository;

import com.employee.demo.model.Employee;

public class HourlyEmployeeRepository extends Employee {
    private static final double VACATION_DAYS_PER_YEAR = 10;

    public HourlyEmployeeRepository() {
        super();
    }

    @Override
    public void work(int days) {
    	if((days < 0 && days > 260)) {
			throw new IllegalArgumentException("Worked days cannot be less than zero and more than 260!");
        }

        double newVacationDays = getVacationDays() + (VACATION_DAYS_PER_YEAR / 260) * days;
        setVacationDays(Math.min(newVacationDays, VACATION_DAYS_PER_YEAR));
    }
}