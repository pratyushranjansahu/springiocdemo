package com.workshop.springiocdemo.beans;
import javax.inject.Named;
import javax.inject.Inject;
@Named
public class NamedEmployee {
	public String getEmpMsg() {
		return "Software makes world beautiful";
	}
}
