package com.hibernate.configuration;

public class App {
	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setEmployeeId("1");

		SessionWrapper.openSession();
		SessionWrapper.beginTransaction();
		SessionWrapper.saveObject(emp);
		SessionWrapper.commitTransaction();
		SessionWrapper.closeSession();

	}
}
