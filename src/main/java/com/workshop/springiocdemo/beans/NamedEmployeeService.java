package com.workshop.springiocdemo.beans;

import javax.inject.Inject;
import javax.inject.Named;
@Named
public class NamedEmployeeService {
	private NamedEmployee employee;
	public NamedEmployee getEmployee() {
		return employee;
	}
	@Inject
	public void setEmployee(NamedEmployee employee) {
		this.employee = employee;
	}
}
