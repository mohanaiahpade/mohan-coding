package com.employee.demo.model;

public abstract class Employee {
    private double vacationDays;

    public Employee() {
        this.vacationDays = 0;
    }

    public double getVacationDays() {
        return vacationDays;
    }

    protected void setVacationDays(double vacationDays) {
        this.vacationDays = vacationDays;
    }

    public abstract void work(int days);

    public void takeVacation(double days) {
        if (days <= vacationDays) {
            vacationDays -= days;
        } else {
            throw new IllegalArgumentException("Not enough vacation days available.");
        }
    }
}