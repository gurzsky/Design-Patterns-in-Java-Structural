package com.course.adapter;

public class EmployeeAdapterCSV implements Employee {
	
	public EmployeeCSV instance;
	
	public EmployeeAdapterCSV(EmployeeCSV instance) {
		this.instance = instance;
	}

	public String getId() {
		return String.valueOf(instance.getId());
	}

	public String getFirstName() {
		return instance.getFirstname();
	}

	public String getLastName() {
		return instance.getLastname();
	}

	public String getEmail() {
		return instance.getEmailAddress();
	}

	@Override
	public String toString() {
		return "EmployeeAdapterCSV [instance=" + instance + "]";
	}
	
	
}
