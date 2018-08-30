package com.imcs.customer.customerJPA;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Customer {
	@Id
	private Integer customerId;
	private String name;
	private String dataOfBirth;
	private double anualSalary; 
	private String address;
	private double payment;
}