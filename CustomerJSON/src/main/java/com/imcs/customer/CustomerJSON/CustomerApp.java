package com.imcs.customer.CustomerJSON;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.imcs.json.customer.Address;
import com.imcs.json.customer.Customer;
import com.imcs.json.customer.Payment;

public class CustomerApp {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		serialize();
		deserialize();
	}
	// calling serialize method
	private static void serialize() throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();

		Address address = new Address(1221, "wallnut hill", "irving", "Tx", 76023);
		Customer cust = new Customer(101, "Raj", "02/21/1992", 120000, address, Payment.CREDIT);

		// configure Object mapped for pretty print
		objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

		// writing to console, can write to any output stream such as file
		objectMapper.writeValue(System.out, cust);
		objectMapper.writeValue(new File("C:\\Users\\suwas\\Desktop\\jsonFile.json"), cust);
	}

	// calling deSerialize method
	private static void deserialize() throws IOException {
		byte[] customer = Files.readAllBytes(Paths.get("C:\\Users\\suwas\\Desktop\\jsonFile.json"));
		ObjectMapper mapper = new ObjectMapper();
		Customer readValue = mapper.readValue(customer, Customer.class);
		
		// System.out.println(readValue);
		System.out.println("Customer Object\n" + readValue);
	}

}
