package com.imcs.json.customer;

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
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int streetNum, String streetName, String city, String state, int zip) {
		
		this.streetNum = streetNum;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	public int getStreetNum() {
		return streetNum;
	}
	public void setStreetNum(int streetNum) {
		this.streetNum = streetNum;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	@Override
	public String toString() {
		return "Address [streetNum=" + streetNum + ", streetName=" + streetName + ", city=" + city + ", state=" + state
				+ ", zip=" + zip + "]";
	}
	
	
	

}
