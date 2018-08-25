package com.Akhilesh.Employee;

public class Department {
	private int deptId;
	private String deptName;
	
	
	Department() {
		super();
	}

	Department(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public int getDeptId() {
		return deptId;
	}


	public String getDeptName() {
		return deptName;
	}




	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}

	public static void main(String[] args) {
	

	}

}
