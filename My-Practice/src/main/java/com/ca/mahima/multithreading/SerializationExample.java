package com.ca.mahima.multithreading;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.ca.mahima.collections.Employee;

public class SerializationExample {
	public static void main(String[] args) {

		Employee emp = new Employee(1, "A", 100000, null, null);
		String fileName = "employee.txt";
		
		try {
			emp.clone();
		} catch (CloneNotSupportedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// saving obj into file serialization
		System.out.println("Srialization-------------");

		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			emp.setName("Mahima");
			emp.setDob(1978L); // ignore transient variables value
			out.writeObject(emp);

			out.close();
			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Desrialization-------------");

		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);

			Employee ee = (Employee) in.readObject();
			System.out.println(ee.toString());

			file.close();
			in.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
