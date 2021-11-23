package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

@RestController
public class TestController {

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("Developer");
		emp.setEmpId("1");
		emp.setSalary(3000);
		return emp;
  }
  @RequestMapping(value = "/manager", method = RequestMethod.GET)
	public Employee secondPage() {

		Employee emp = new Employee();
		emp.setName("emp2");
		emp.setDesignation("Manager");
		emp.setEmpId("2");
		emp.setSalary(10000);
		return emp;
  }
 

}