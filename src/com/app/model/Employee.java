package com.app.model;

public class Employee {
private int empId;
private String empname;
public Employee(int empId, String empname) {
	super();
	this.empId = empId;
	this.empname = empname;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empname=" + empname + "]";
}

}
