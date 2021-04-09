package com.ca.mahima.collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee implements Serializable, Cloneable {
	private Integer id;
	private String name;
	private Integer salary;
	private transient Long dob;
	private List<String> technologies = new ArrayList<String>();

	public List<String> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(List<String> technologies) {
		this.technologies = technologies;
	}

	public Long getDob() {
		return dob;
	}

	public void setDob(Long dob) {
		this.dob = dob;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public Employee(Integer id, String name, Integer salary, Long dob, List<String> technologies) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dob = dob;
		this.technologies = technologies;
	}

	public Employee() {
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", technologies=" + technologies + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary == null) {
			return other.salary == null;
		} else return salary.equals(other.salary);
	}
//old method
//	public static class CustomComparator implements Comparator<Employee> {
//		public int compare(Employee o1, Employee o2) {
//			int salaryComp = o1.getSalary().compareTo(o2.getSalary());
//			int nameComp = o1.getName().compareTo(o2.getName());
//			if (salaryComp == 0) {
//				return nameComp;
//			}
//			return salaryComp;
//		}
//	}

	// with functional interface implentation

	public final static Comparator<Employee> customComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			int salaryComp = o1.getSalary().compareTo(o2.getSalary());
			int nameComp = o1.getName().compareTo(o2.getName());
			if (salaryComp == 0) {
				return nameComp;
			}
			return salaryComp;
		}

	};

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
