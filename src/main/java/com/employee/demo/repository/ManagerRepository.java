package com.employee.demo.repository;


public class ManagerRepository extends SalariedEmployeeRepository {
    private static final double VACATION_DAYS_PER_YEAR = 30;

    public ManagerRepository() {
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
