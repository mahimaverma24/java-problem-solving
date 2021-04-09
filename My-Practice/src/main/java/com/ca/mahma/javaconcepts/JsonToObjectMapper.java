package com.ca.mahma.javaconcepts;

import com.ca.mahima.collections.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToObjectMapper {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Mahima");
		emp.setSalary(100000);
		emp.setDob(1997L);
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
			System.out.println(json);
			// convert this json string into Employee object;
			Employee ee = mapper.readValue(json, Employee.class);
			System.out.println(ee.toString());
			

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}
