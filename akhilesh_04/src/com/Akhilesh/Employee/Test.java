package com.Akhilesh.Employee;

import java.util.*;

public class Test {
	
	
	private static void displayEmployeeList(List<Employee> emplist) {
		Iterator<Employee> i= emplist.iterator();
		while(i.hasNext()) {
		Employee employee = i.next();
		try{
		if(employee.getAge()<18 || employee.getAge()>70){
			throw new AgeException();
		}
		System.out.println("Employee ID: "+employee.getEmployeeId()+", Employee Name: "+employee.getEmployeeName()+", Employee Age: "+employee.getAge()+" Department: "+employee.getDepartment().getDeptName()+ " Salary is: "+employee.getSalary());
		}
		catch(AgeException e){
			System.out.println(e);
		}
		
		}
		
		
	}
	public List<Employee> searchEmployees (List<Employee> emplist, int deptId){
		List<Employee> searchResult = new ArrayList<Employee>();
		for(Employee employee : emplist)
			if(employee.getDepartment().getDeptId()==deptId){
				searchResult.add(employee);	
			}
		return searchResult;
	}
	
	public List<Employee> employeesWithAgeLessThan (List<Employee> emplist, int age)
	{
		List<Employee> searchResult= new ArrayList<Employee>();
		for(Employee employee : emplist){
			if(employee.getAge()< age){
				searchResult.add(employee);
			}
		}
		return searchResult;
		
	}
	
	public static Employee searchYoungestEmployee(List<Employee> emplist){
		Employee employee=new Employee();		
		int min = Integer.MAX_VALUE;
		for(int i=0;i<emplist.size();i++){
		 if(emplist.get(i).getAge()< min){
			 min= emplist.get(i).getAge();
			 employee=emplist.get(i);
	      }
		}
		System.out.println("Youngest employee is: "+ employee);
		return employee;	
	}
	
	public static Employee employeewithMaxSalary(List<Employee> emplist){
		Employee employee=new Employee();
		int max=Integer.MIN_VALUE;
		for(int i=0;i<emplist.size();i++){
			 if(emplist.get(i).getSalary() > max){
				 max= emplist.get(i).getSalary();
				 employee=emplist.get(i);
		      }
			}
			System.out.println("Max salary is given to: "+ employee);
			return employee;	
	}
	
	public static void main(String[] args) throws AgeException {
		Department department1=new Department(1,"Computer Science");
		Department department2=new Department(2,"ECE");
		Department department3=new Department(3,"Civil");
		
	
		Employee employee1 = new Employee(1,"Akhilesh",1,department1,100000000);
		Employee employee2 = new Employee(2,"Uttam",07,department3,100000);
		Employee employee3 = new Employee(3,"Parth",05,department1,000);
		Employee employee4 = new Employee(4,"Akshay",04,department3,70000);
		Employee employee5 = new Employee(5,"John",27,department1,400000);
		Employee employee6 = new Employee(6,"Narendra",21,department1,70000);
		Employee employee7 = new Employee(7,"Sohan",20,department2,100000);
		Employee employee8 = new Employee(8,"Soham",03,department2,1000300);

		
		List<Employee> emplist = new ArrayList();
		emplist.add(employee1);
		emplist.add(employee2);
		emplist.add(employee3);
		emplist.add(employee4);
		emplist.add(employee5);
		emplist.add(employee6);
		emplist.add(employee7);
		emplist.add(employee8);
		
		Test test=new Test();
		List<Employee> deptresult = test.searchEmployees(emplist, 2);
		List<Employee> ageResult=test.employeesWithAgeLessThan(emplist, 30);
	    //displayEmployeeList(deptresult);
	    //displayEmployeeList(ageResult);
	    searchYoungestEmployee(emplist);
	    employeewithMaxSalary(emplist);
		//displayEmployeeList(emplist);
		
	}
	
	}
		
	


