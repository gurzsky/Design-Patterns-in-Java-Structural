package com.course.adapter;

public class EmployeeAdapterLdap implements Employee {
	
	private EmployeeLdap instance;
	
	public EmployeeAdapterLdap(EmployeeLdap instance) {
		this.instance = instance;
	}

	public String getId() {
		return instance.getCn();
	}

	public String getFirstName() {
		return instance.getGivenName();
	}

	public String getLastName() {
		return instance.getSurname();
	}

	public String getEmail() {
		return instance.getMail();
	}

	@Override
	public String toString() {
		return "EmployeeAdapterLdap [instance=" + instance + "]";
	}

}
