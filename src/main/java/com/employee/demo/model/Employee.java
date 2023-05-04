package com.employee.demo.model;

public class Employee {
	
	private float noOfVacationDaysAccumulated;
    private int id;
    private int workedDays;
    
    public Employee(float noOfVacationDaysAccumulated,int workedDays,int empId) {
    	this.noOfVacationDaysAccumulated = noOfVacationDaysAccumulated;
    	this.id = empId;
    }

	public float getNoOfVacationDaysAccumulated() {
		return noOfVacationDaysAccumulated;
	}

	public void setNoOfVacationDaysAccumulated(float noOfVacationDaysAccumulated) {
		this.noOfVacationDaysAccumulated = noOfVacationDaysAccumulated;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getWorkedDays() {
		return workedDays;
	}

	public void setWorkedDays(int workedDays) {
		this.workedDays = workedDays;
	}
	
}
