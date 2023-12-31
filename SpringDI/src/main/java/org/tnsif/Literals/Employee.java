package org.tnsif.Literals;

public class Employee {
	
	//private data members
	private int empid;
	private String empname;
	private String address;
	private float salary;
	
	
	//getters and setters
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public void print()
	{
		System.out.println("Emp ID: "+empid+"Emp Name: "+empname+"Address : "+address+"Salary: "+salary);
	}
	
}
