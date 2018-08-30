package com.imcs.customer.customerJPA;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	private int streetNum;
	private String streetName;
	private String city;
	private String state;
	private int zip;


}
