package com.Akhilesh.Employee;

public class AgeException extends Exception {
	public AgeException() {
		super("Invalid input: Age cannot be less than 18 or more than 70");
	}

	}


