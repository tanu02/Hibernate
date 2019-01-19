package com.hibernate.configuration;

import java.util.List;

public class App {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setEmpName("Tanu");

		Company cmp = new Company();
		cmp.setCompanyId("aapl");
		cmp.setCompanyName("Apple");
		cmp.getEmployees().add(emp);

		SessionWrapper.openSession();
		SessionWrapper.beginTransaction();
		SessionWrapper.saveObject(cmp);
		SessionWrapper.commitTransaction();
		SessionWrapper.closeSession();

		SessionWrapper.openSession();
		Company company = new Company();
		company = (Company) SessionWrapper.get(company, "aapl");
		SessionWrapper.closeSession();
		operationsOnUser(company);

	}

	static void operationsOnUser(Company company) {
		List<Employee> employees = company.getEmployees();

		employees.stream().filter(emp -> emp.getEmpName().equals("Tanu") == true // single
																					// condition
		).forEach(emp -> System.out.println(emp.getEmpId()));
	}
}
