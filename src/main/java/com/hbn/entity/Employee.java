package com.hbn.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;



@Entity
public class Employee {
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name,gender;
	private int salary;
	private int age;
	
	@OneToOne
	private Address address;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee( String name, String gender, int salary, int age,Address address) {
		super();
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.age = age;
		this.address=address;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + ", age=" + age
				+ ", address=" + address + "]";
	}
    
	
	

}
