package com.demo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.beans.Employee;

public class Test {

	public static void main(String[] args) {
 
		System.out.println("hi");
		System.out.println("Hello");
		
		List<Employee> employeeList1 = new ArrayList<>(Arrays.asList(new Employee("e1", "RAMESH", 1000),
				new Employee("e2", "Rajesh", 2000),new Employee("e3", "Raju", 3000),new Employee("e4", "Ragiv", 4000)
				));
		
		List<Employee> empList2 = employeeList1.stream().filter(emp->emp.getEmpSalary() < 3000).map(emp1->new Employee(emp1.getEmpId(), emp1.getEmpName(), emp1.getEmpSalary())).collect(Collectors.toList());
		
		   empList2.forEach(System.out::println);
		   System.out.println("Employee List Display Above");
		   System.out.println("This is the Feature Move to master");
		   for(Employee emp1 : empList2)
		   {
			   System.out.println(emp1);
		   }
	}

}
