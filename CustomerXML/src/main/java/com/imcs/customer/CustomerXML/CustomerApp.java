package com.imcs.customer.CustomerXML;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.imcs.jaxb.pojo.Customer;

public class CustomerApp {

	public static void main(String[] args) throws JAXBException {
		Customer customer = unMarshall();

		marshall(customer);

	}

	public static void marshall(Customer customer) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Customer.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal(customer, System.out);
		marshaller.marshal(customer, new File("C:\\Users\\suwas\\Desktop\\json.txt"));

	}

	public static Customer unMarshall() throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Customer.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();

		Customer customer = (Customer) unmarshaller.unmarshal(new File(
				"C:\\Users\\suwas\\eclipse-workspace\\AdvanceJavaAssignment\\CustomerXML\\src\\main\\java\\Resources\\Customer.xml"));

		System.out.println(customer);

		return customer;

	}

}
