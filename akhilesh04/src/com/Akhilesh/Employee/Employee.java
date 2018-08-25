package com.Akhilesh.Employee;

public class Employee {
	private int employeeId;
	private String employeeName;
	private int age;
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeID(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName= employeeName;
	}
	public static void main()
	{
		Employee[] emp = new Employee[5];
	}
}
