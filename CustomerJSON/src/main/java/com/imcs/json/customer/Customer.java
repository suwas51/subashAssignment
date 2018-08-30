package com.imcs.json.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	private int customerId;
	private String name;
	private String dataOfBirth;
	private double anualSalary; 
	private Address address;
	private Payment payment;
	public Customer(int customerId, String name, String dataOfBirth, double anualSalary, Address address,
			Payment payment) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.dataOfBirth = dataOfBirth;
		this.anualSalary = anualSalary;
		this.address = address;
		this.payment = payment;
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDataOfBirth() {
		return dataOfBirth;
	}
	public void setDataOfBirth(String dataOfBirth) {
		this.dataOfBirth = dataOfBirth;
	}
	public double getAnualSalary() {
		return anualSalary;
	}
	public void setAnualSalary(double anualSalary) {
		this.anualSalary = anualSalary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", dataOfBirth=" + dataOfBirth
				+ ", anualSalary=" + anualSalary + ", address=" + address + ", payment=" + payment + "]";
	}
	
	
}
