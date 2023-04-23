package com.code;

public class Employe {
	
	private String name;
	private int id;
	private double salary;
	
	Employe(){
		
	}
	Employe(String namahe, int idNumber, double salaryAmount){
		this.name=namahe;
		this.id=idNumber;
		this.salary=salaryAmount;
	}
	
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name= name;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	public String toString() {
		return name+" "+id+" "+salary;
	}

}
