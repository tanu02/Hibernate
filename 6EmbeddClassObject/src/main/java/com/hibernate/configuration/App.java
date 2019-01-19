package com.hibernate.configuration;

public class App {

	public static void main(String[] args) {

		Department salesDep = new Department();
		salesDep.setHeadCounts(5);
		salesDep.setDescription("Sales Department");

		Department operationsDep = new Department();
		operationsDep.setHeadCounts(7);
		operationsDep.setDescription("Operations Department");

		Company com = new Company();
		com.setCompanyId("aapl");
		com.setCompanyName("Apple");
		com.setSalesDep(salesDep);
		com.setOperationsDep(operationsDep);

		SessionWrapper.openSession();
		SessionWrapper.beginTransaction();
		SessionWrapper.saveObject(com);
		SessionWrapper.commitTransaction();
		SessionWrapper.closeSession();
	}
}
