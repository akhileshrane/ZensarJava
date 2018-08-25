package com.Akhilesh.Employee;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;


public class Test extends Employee {
	static Employee[] emp = new Employee[2];
	
	
	public static void main() {
	    List list = (List)Arrays.asList(emp);
	    Iterator itr = ((java.util.List<Employee>) list).iterator();
	    while(itr.hasNext())
	        list.add(emp);
	     
	    }
}
	  
	


